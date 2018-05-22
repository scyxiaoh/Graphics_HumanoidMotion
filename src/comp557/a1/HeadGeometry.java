package comp557.a1;

/**
 * 
 * @author Kevin Sun	Student ID: 260686589
 *
 */

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.util.gl2.GLUT;

public class HeadGeometry extends DAGNode {

	public HeadGeometry(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void display( GLAutoDrawable drawable ) {
    	GL2 gl = drawable.getGL().getGL2();
    	
    	gl.glPushMatrix();
    	
    	gl.glColor3d(1, 1, 0.5);
    	gl.glScaled(1, 1.2, 1);
    	glut.glutSolidSphere(1.4, 100, 100);
    	
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    	
    	gl.glTranslated(-0.4, 0.4, 0.9);
    	gl.glColor3d(1,1,1);
    	gl.glScaled(1,1,1);
    	glut.glutSolidSphere(0.5, 100, 100);
    	
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    	
    	gl.glTranslated(0.4, 0.4, 0.9);
    	gl.glColor3d(1,1,1);
    	gl.glScaled(1,1,1);
    	glut.glutSolidSphere(0.5, 100, 100);
    	
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    	
    	gl.glTranslated(-0.5, 0.4, 1.3);
    	gl.glColor3d(0,0,0);
    	gl.glScaled(1,1,1);
    	glut.glutSolidSphere(0.2, 100, 100);
    	
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    	
    	gl.glTranslated(0.5, 0.4, 1.3);
    	gl.glColor3d(0,0,0);
    	gl.glScaled(1,1,1);
    	glut.glutSolidSphere(0.2, 100, 100);
    	
    	gl.glPopMatrix();

    }
}
