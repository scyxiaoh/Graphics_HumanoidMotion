package comp557.a1;

/**
 * 
 * @author Kevin Sun	Student ID: 260686589
 *
 */

import java.util.LinkedList;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class HingeJoint extends DAGNode {

	DoubleParameter thelta;
	double axisX;
	double axisY;
	double axisZ;
	double x;
	double y;
	double z;
	
	public HingeJoint(String name, double x, double y, double z, double minAngle, double maxAngle, double axisX, double axisY, double axisZ) {
		super(name);
		dofs.add( thelta = new DoubleParameter( name+" thelta", 0, minAngle, maxAngle ) );
		this.axisX = axisX;
		this.axisY = axisY;
		this.axisZ = axisZ;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();

		gl.glPushMatrix();
		
		gl.glTranslated(x, y, z);
		gl.glRotated(thelta.getValue(), axisX, axisY, axisZ);
		super.display(drawable);
		
		gl.glPopMatrix();
	}
	
	public void setBound(double min, double max) {
		((DoubleParameter)dofs.toArray()[0]).setMaximum(max);
		((DoubleParameter)dofs.toArray()[0]).setMinimum(min);
	}
	
	public double getMaximum() {
		return ((DoubleParameter)dofs.toArray()[0]).getMaximum();
	}

	public double getMinimum() {
		return ((DoubleParameter)dofs.toArray()[0]).getMinimum();
	}
}
