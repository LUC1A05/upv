package KostuarenKalkulua;

public class Proba {
	public static void main(String[] args) {
		ZereginenZuhaitza zz = new ZereginenZuhaitza();
		zz.root = new BinaryTreeNode();
		zz.root.element = new Zeregin();
		zz.root.element.id = "T7";
		zz.root.element.kostua = 5;
		zz.root.left = new BinaryTreeNode();
		zz.root.left.element = new Zeregin();
		zz.root.left.element.id = "T1";
		zz.root.left.element.kostua = 5;
		zz.root.right = new BinaryTreeNode();
		zz.root.right.element = new Zeregin();
		zz.root.right.element.id = "T12";
		zz.root.right.element.kostua = 3;
		
		int ema = zz.kostua("T7");
		System.out.println(ema);
		ema = zz.kostua("T1");
		System.out.println(ema);
		ema = zz.kostua("T12");
		System.out.println(ema);
	}
}
