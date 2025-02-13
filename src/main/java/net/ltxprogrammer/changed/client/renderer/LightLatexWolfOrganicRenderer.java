package net.ltxprogrammer.changed.client.renderer;

import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.client.renderer.model.LightLatexWolfOrganicModel;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexWolfModel;
import net.ltxprogrammer.changed.entity.beast.LightLatexWolfOrganic;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class LightLatexWolfOrganicRenderer extends LatexHumanoidRenderer<LightLatexWolfOrganic, LightLatexWolfOrganicModel, ArmorLatexWolfModel<LightLatexWolfOrganic>> {
    public LightLatexWolfOrganicRenderer(EntityRendererProvider.Context context) {
        super(context, new LightLatexWolfOrganicModel(context.bakeLayer(LightLatexWolfOrganicModel.LAYER_LOCATION)),
                ArmorLatexWolfModel::new, ArmorLatexWolfModel.INNER_ARMOR, ArmorLatexWolfModel.OUTER_ARMOR, 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LightLatexWolfOrganic p_114482_) {
        return Changed.modResource("textures/light_latex_wolf_male.png");
    }
}