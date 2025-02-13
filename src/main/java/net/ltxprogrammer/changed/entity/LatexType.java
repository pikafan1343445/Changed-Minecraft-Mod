package net.ltxprogrammer.changed.entity;

import net.ltxprogrammer.changed.entity.variant.LatexVariantInstance;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.changed.item.AbstractLatexBucket;
import net.ltxprogrammer.changed.item.AbstractLatexGoo;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.changed.util.Util;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.IExtensibleEnum;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum LatexType implements StringRepresentable, IExtensibleEnum {
    NEUTRAL(),
    DARK_LATEX(ChangedItems.DARK_LATEX_GOO, ChangedItems.DARK_LATEX_BUCKET, ChangedBlocks.DARK_LATEX_BLOCK, ChangedParticles.Color3.DARK),
    WHITE_LATEX(ChangedItems.WHITE_LATEX_GOO, ChangedItems.WHITE_LATEX_BUCKET, ChangedBlocks.WHITE_LATEX_BLOCK, ChangedParticles.Color3.WHITE);

    public final Supplier<? extends AbstractLatexGoo> goo;
    public final Supplier<? extends AbstractLatexBucket> gooBucket;
    public final Supplier<? extends Block> block;
    public final ChangedParticles.Color3 color;

    LatexType() {
        this.goo = () -> null;
        this.gooBucket = () -> null;
        this.block = () -> null;
        this.color = ChangedParticles.Color3.WHITE;
    }
    LatexType(Supplier<? extends AbstractLatexGoo> goo, Supplier<? extends AbstractLatexBucket> gooBucket, Supplier<? extends Block> block, ChangedParticles.Color3 color) {
        this.goo = goo;
        this.gooBucket = gooBucket;
        this.block = block;
        this.color = color;
    }

    public static LatexType getEntityLatexType(@NotNull Entity entity) {
        if (entity instanceof LatexEntity latexEntity) {
            return latexEntity.getLatexType();
        }

        else
            return ProcessTransfur.ifPlayerLatex(Util.playerOrNull(entity), LatexVariantInstance::getLatexType, () -> null);
    }

    public static boolean hasLatexType(@NotNull Entity entity) {
        return getEntityLatexType(entity) != null;
    }

    public static boolean hasFactionLatexType(@NotNull Entity entity) {
        return isFaction(getEntityLatexType(entity));
    }

    public static boolean isFaction(LatexType type) {
        if (type == NEUTRAL || type == null) return false;
        return true;
    }

    public static LatexType factionOrNull(LatexType type) {
        if (type == NEUTRAL) return null;
        return type;
    }

    public static LatexType getEntityFactionLatexType(@NotNull Entity entity) {
        return factionOrNull(getEntityLatexType(entity));
    }

    public boolean isHostileTo(LatexType other) {
        return (isFaction(this) && isFaction(other) && this != other) || other == null;
    }

    @Override
    public String getSerializedName() {
        return toString().toLowerCase();
    }

    public static LatexType create(String name, Supplier<? extends Item> goo, Supplier<? extends Item> gooBucket, Supplier<Block> block, ChangedParticles.Color3 color)
    {
        throw new IllegalStateException("Enum not extended");
    }
}
