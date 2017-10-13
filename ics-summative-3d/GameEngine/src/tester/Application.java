package tester;

import org.lwjgl.opengl.Display;

import models.Model;
import render.Displayer;
import render.Loader;
import render.Renderer;
import shader.StaticShader;

public class Application {

	public static void main(String[] args) {
		Displayer.create();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		StaticShader shader = new StaticShader();
		
		// Vertices of shape should be counterclockwise
		float[] vertices = {
				-0.5f, 0.5f, 0,
				-0.5f, -0.5f, 0,
				0.5f, -0.5f, 0,
				0.5f, 0.5f, 0
				}; // rectangle coords (x, y, z)
		int[] indices = {
				0, 1, 3, 
				3, 1, 2
				}; // triangles
		Model model = loader.loadToVAO(vertices, indices);
		
		while(!Display.isCloseRequested()) {
			renderer.start();
			shader.start();

			renderer.render(model);
			shader.stop();
			Displayer.update();
		}
		shader.close();
		loader.close();
		Displayer.close();
	}

}
