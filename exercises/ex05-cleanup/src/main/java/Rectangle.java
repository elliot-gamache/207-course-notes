/**
 * A rectangle with scalable dimensions.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Rectangle with given width and height.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Double the rectangle area.
   *
   * @return the new area
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the scaling factor of the rectangle
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compare the areas of two rectangles.
   *
   * @param other the comparison rectangle
   * @return true iff the rectangle is larger than the area of @other
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
