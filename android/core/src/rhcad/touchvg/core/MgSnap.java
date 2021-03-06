/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgSnap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgSnap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgSnap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgSnap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void clearSnap(MgMotion sender) {
    touchvgJNI.MgSnap_clearSnap(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean drawSnap(MgMotion sender, GiGraphics gs) {
    return touchvgJNI.MgSnap_drawSnap(swigCPtr, this, MgMotion.getCPtr(sender), sender, GiGraphics.getCPtr(gs), gs);
  }

  public int getSnappedType() {
    return touchvgJNI.MgSnap_getSnappedType(swigCPtr, this);
  }

  public int getSnappedPoint(Point2d fromPt, Point2d toPt) {
    return touchvgJNI.MgSnap_getSnappedPoint(swigCPtr, this, Point2d.getCPtr(fromPt), fromPt, Point2d.getCPtr(toPt), toPt);
  }

  public Point2d snapPoint(MgMotion sender, Point2d orignPt) {
    return new Point2d(touchvgJNI.MgSnap_snapPoint(swigCPtr, this, MgMotion.getCPtr(sender), sender, Point2d.getCPtr(orignPt), orignPt), true);
  }

}
