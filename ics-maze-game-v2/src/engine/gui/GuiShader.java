package engine.gui;

import org.lwjgl.util.vector.Matrix4f;

import engine.render.Shader;

public class GuiShader extends Shader{

    private static final String VERTEX_FILE = "src/engine/gui/guiVertexShader.glsl";
    private static final String FRAGMENT_FILE = "src/engine/gui/guiFragmentShader.glsl";

    private int location_transformationMatrix;

    public GuiShader() {
        //create(VERTEX_FILE, FRAGMENT_FILE);
    }

    public void loadTransformation(Matrix4f matrix){
        super.loadMatrix(location_transformationMatrix, matrix);
    }

    @Override
    public void getUniformLocation() {
        location_transformationMatrix = super.getUniformLocation("transformationMatrix");
    }
    @Override
    public void bindAttribute() {
        super.bindAttribute(0, "position");
    }
}
