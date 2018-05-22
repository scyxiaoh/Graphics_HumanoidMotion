package comp557.a1;

/**
 * 
 * @author Kevin Sun	Student ID: 260686589
 *
 */
public class CharacterCreator {

	static public String name = "Little Soldier - Kevin Sun 260686589";
	
	/** 
	 * Creates a character.
	 * @return root DAGNode
	 */
	static public DAGNode create() {
		// TODO: use for testing, and ultimately for creating a character
		// Here we just return null, which will not be very interesting, so write
		// some code to create a charcter and return the root node.
		
		FreeJoint root = new FreeJoint("humanoid");
		HingeJoint head = new HingeJoint("head", 0, 3, 0, -90, 90, 0, 1, 0);
		
		BallJoint leftShoulder = new BallJoint("left shoulder", -1.5, 0.8, -0.3, -75, 75,-5, 120, -100, 90);
		BallJoint rightShoulder = new BallJoint("right shoulder", 1.5, 0.8, -0.3, -75, 75,-120, 5, -90, 100);
		BallJoint leftButtock = new BallJoint("left buttock", -0.6, -1.8, -0.3, -110, 20,-20, 10, -80, 20);
		BallJoint rightButtock = new BallJoint("right buttock", 0.6, -1.8, -0.3, -110, 20,-10, 20, -20, 80);
		
		root.add(head);
		root.add(leftShoulder);
		root.add(rightShoulder);
		root.add(leftButtock);
		root.add(rightButtock);
		root.add(new PartGeometry("body", 0, 0, 0, 1.5, 1, 1.5, 1, 0.5, 0.5, 0.7));
		
		head.add(new HeadGeometry("head"));
		
		leftShoulder.add(new PartGeometry("left shoulder display", 0, 0, 0, 0.5, 1, 1, 1, 0.5, 0.5, 0.7));
		rightShoulder.add(new PartGeometry("right shoulder display", 0, 0, 0, 0.5, 1, 1, 1, 0.5, 0.5, 0.7));
		leftButtock.add(new PartGeometry("left buttock display", 0, 0, 0, 0.825, 1, 1, 1, 0.5, 0.5, 0.7));
		rightButtock.add(new PartGeometry("right buttock display", 0, 0, 0, 0.825, 1, 1, 1, 0.5, 0.5, 0.7));
		
		PartGeometry leftUpperArm = new PartGeometry("left upper arm", -1.2, 0, 0, 0.4, 3.5, 1, 1, 0.5, 0.5, 0.7);
		PartGeometry rightUpperArm = new PartGeometry("right upper arm", 1.2, 0, 0, 0.4, 3.5, 1, 1, 0.5, 0.5, 0.7);
		leftShoulder.add(leftUpperArm);
		rightShoulder.add(rightUpperArm);
		
		HingeJoint leftElbow = new HingeJoint("left elbow", -2.4, 0, 0, -5, 150, 0, 1, 0);
		HingeJoint rightElbow = new HingeJoint("Right elbow", 2.4, 0, 0, -150, 5, 0, 1, 0);
		leftElbow.add(new PartGeometry("left elbow display", 0, 0, 0, 0.3, 1, 1, 1, 1, 1, 0.5));
		rightElbow.add(new PartGeometry("right elbow display", 0, 0, 0, 0.3, 1, 1, 1, 1, 1, 0.5));
		
		leftShoulder.add(leftElbow);
		rightShoulder.add(rightElbow);
		
		PartGeometry leftLowerArm = new PartGeometry("left lower arm", -1.2, 0, 0, 0.35, 4.5, 1, 1, 0.5, 0.5, 0.7);
		PartGeometry rightLowerArm = new PartGeometry("right lower arm", 1.2, 0, 0, 0.35, 4.5, 1, 1, 0.5, 0.5, 0.7);
		leftElbow.add(leftLowerArm);
		rightElbow.add(rightLowerArm);
		leftElbow.add(new PartGeometry("left hand", -2.6, 0, 0, 0.35, 1, 1, 1, 1, 1, 1));
		rightElbow.add(new PartGeometry("right hand", 2.6, 0, 0, 0.35, 1, 1, 1, 1, 1, 1));
		
		PartGeometry leftUpperLeg = new PartGeometry("left upper leg", 0, -1.5, 0.35, 0.75, 1, 2.6, 1, 0.5, 0.5, 0.7);
		PartGeometry rightUpperLeg = new PartGeometry("right upper leg", 0, -1.5, 0.35, 0.75, 1, 2.6, 1, 0.5, 0.5, 0.7);
		leftButtock.add(leftUpperLeg);
		rightButtock.add(rightUpperLeg);
		
		HingeJoint leftKnee = new HingeJoint("left knee", 0, -3.1, 0.45, -1, 130, 1, 0, 0);
		HingeJoint rightKnee = new HingeJoint("right knee", 0, -3.1, 0.45, -1, 130, 1, 0, 0);
		leftButtock.add(leftKnee);
		rightButtock.add(rightKnee);
		leftKnee.add(new PartGeometry("left knee display", 0, 0, 0, 0.4, 1, 1, 1, 1, 1, 0.5));
		rightKnee.add(new PartGeometry("right knee display", 0, 0, 0, 0.4, 1, 1, 1, 1, 1, 0.5));
		
		PartGeometry leftLowerLeg = new PartGeometry("left lower leg", 0, -1.2, -0.05, 0.45, 1, 3.75, 1, 0.5, 0.5, 0.7);
		PartGeometry rightLowerLeg = new PartGeometry("right lower leg", 0, -1.2, -0.05, 0.45, 1, 3.75, 1, 0.5, 0.5, 0.7);
		leftKnee.add(leftLowerLeg);
		rightKnee.add(rightLowerLeg);
		leftKnee.add(new PartGeometry("left foot", 0, -2.7, 0.5, 0.4, 1, 1, 1.5, 1, 1, 0.5));
		rightKnee.add(new PartGeometry("right foot", 0, -2.7, 0.5, 0.4, 1, 1, 1.5, 1, 1, 0.5));
		return root;
	}
}
