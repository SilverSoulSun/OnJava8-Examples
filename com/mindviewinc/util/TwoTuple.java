// com/mindviewinc/util/TwoTuple.java
// �2015 MindView LLC: see Copyright.txt
package com.mindviewinc.util;

public class TwoTuple<A, B> {
  public final A first;
  public final B second;
  public TwoTuple(A a, B b) { first = a; second = b; }
  @Override
  public String toString() {
    return "(" + first + ", " + second + ")";
  }
}
