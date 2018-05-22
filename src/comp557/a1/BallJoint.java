package comp557.a1;

/**
 * 
 * @author Kevin Sun	Student ID: 260686589
 *
 */

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class BallJoint extends DAGNode {

	DoubleParameter rx;
	DoubleParameter ry;
	DoubleParameter rz;
	double x;
	double y;
	double z;
	
	public BallJoint(String name, double x, double y, double z, double rMinX, double rMaxX, double rMinY, double rMaxY, double rMinZ, double rMaxZ) {
		super(name);
		dofs.add( rx = new DoubleParameter( name+" rx", 0, rMinX, rMaxX ) );		
		dofs.add( ry = new DoubleParameter( name+" ry", 0, rMinY, rMaxY ) );
		dofs.add( rz = new DoubleParameter( name+" rz", 0, rMinZ, rMaxZ ) );
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();

		gl.glPushMatrix();
		
		gl.glTranslated(x, y, z);
		gl.glRotated(rx.getValue(), 1, 0, 0);
		gl.glRotated(ry.getValue(), 0, 1, 0);
		gl.glRotated(rz.getValue(), 0, 0, 1);
		super.display(drawable);
		
		gl.glPopMatrix();
	}
	

}
