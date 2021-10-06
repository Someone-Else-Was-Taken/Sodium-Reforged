package net.coderbot.iris.layer;

//import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.renderer.RenderState;

public class IsBlockEntityRenderPhase extends RenderState {
	public static final IsBlockEntityRenderPhase INSTANCE = new IsBlockEntityRenderPhase();

	private IsBlockEntityRenderPhase() {
		super("iris:is_block_entity", GbufferPrograms::beginBlockEntities, GbufferPrograms::endBlockEntities);
	}
}
