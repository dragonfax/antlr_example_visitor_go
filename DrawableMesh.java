/* An example java class to use. */
package com.interrupt.dungeoneer.gfx.drawables;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.Array;

public class DrawableMesh extends Drawable {
	/** Mesh filepath. */
	public String meshFile = "meshes/chair.obj";

	/** Mesh texture filepath. */
	public String textureFile = "meshes.png";
	
	public transient Mesh loadedMesh;
	public transient Texture loadedTexture;
	
	public transient boolean couldLoad = true;
	
	private transient Matrix4 modelView = null;
	private transient Matrix4 combined = new Matrix4();

	public transient Vector3 scaleVector = null;

	/** Position x-coordinate. */
	public float x = 0;

	/** Position y-coordinate. */
	public float y = 0;

	/** Position z-coordinate. */
	public float z = 0;

	/** Rotation x-coordinate. */
	public float rotX = 0;

	/** Rotation y-coordinate. */
	public float rotY = 0;

	/** Rotation z-coordinate. */
	public float rotZ = 0;
	
	public transient BoundingBox bbox = null;
	private transient BoundingBox frustrumCheckBox = new BoundingBox();

	/** Is mesh static. Static meshes are combined and drawn more efficiently. */
	public boolean isStaticMesh = false;

    public boolean addCollisionTriangles = false;

    public boolean bakeLighting = false;
    private transient Mesh bakedMesh = null;
    private transient Vector3 bakedRotation = new Vector3(0, 0, 0);

    // Scratch work quaternions and vectors
    private transient Quaternion workQuat1 = new Quaternion();
    private transient Quaternion workQuat2 = new Quaternion();
    private transient Vector3 workVec1 = new Vector3();
    private transient Vector3 workVec2 = new Vector3();


    public DrawableMesh() { }

}
