class MathThings {
  public static final double PIAPPROX = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;

  public static double circleSurfaceArea(int x) {
    return PIAPPROX * x * x;
  }

  public static double boxVolume(double x) {
    return x * x * x;
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("nは" + MathThings.PIAPPROX + "です");

    System.out.println("1辺が2の立方体の体積は" + MathThings.boxVolume(2) + "です");
    System.out.println("半径4の円の面積は" + MathThings.circleSurfaceArea(4));

    System.out.println("1辺が5の立方体の体積は" + MathThings.boxVolume(5));
  }
}