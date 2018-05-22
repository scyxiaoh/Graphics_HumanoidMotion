package comp557.a1;

/**
 * 
 * @author Kevin Sun	Student ID: 260686589
 *
 */

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.util.gl2.GLUT;

import mintools.viewer.FancyAxis;

public class PartGeometry extends DAGNode {
	
	double size, x, y, z, scaleX, scaleY, scaleZ, colorR, colorG, colorB;

	public PartGeometry(String name, double x, double y, double z, double size, double scaleX, double scaleY, double scaleZ, double colorR, double colorG, double colorB) {
		super(name);
		this.size = size;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.scaleZ = scaleZ;
		this.colorR = colorR;
		this.colorG = colorG;
		this.colorB = colorB;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
    public void display( GLAutoDrawable drawable ) {
    	GL2 gl = drawable.getGL().getGL2();
    	
    	gl.glPushMatrix();
    	
    	gl.glTranslated(x, y, z);
    	gl.glColor3d(this.colorR, this.colorG, this.colorB);
    	gl.glScaled(this.scaleX, this.scaleY, this.scaleZ);
    	glut.glutSolidSphere(this.size, 100, 100);
    	super.display(drawable);
    	
    	gl.glPopMatrix();

    }
}
