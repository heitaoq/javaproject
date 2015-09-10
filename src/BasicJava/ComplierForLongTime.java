//package BasicJava;
//
///**
// * https://bugs.openjdk.java.net/browse/JDK-8055984
// */
//class C<U> {
//  U fu;
//  C() {}
//  C(C<U> other) { this.fu = other.fu; }
//  C(U fu) { this.fu = fu; }
//
//  static <U> C<U> m(C<U> src) { return new C<U>(src); }
//
//  public static void main(String argv[]) {
//        /* type inference is expected here: */
//    C<String> c2 = m(new C<>(m(new C<>() )) );
//    C<String> c3 = m(new C<>(m(new C<>(m(new C<>() )) )) );
//    C<String> c4 = m(new C<>(m(new C<>(m(new C<>(m(new C<>() )) )) )) ); // Javac(1.04), ECJ(.71s)
//    C<String> c5 = m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>() )) )) )) )) ); // Javac(2.02s), ECJ(1.17s)
//    C<String> c6 = m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>() )) )) )) )) )) ); // Javac(4.84s) ECJ(1.67s)
//    C<String> c7 = m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>() )) )) )) )) )) )) ); // Javac(14.99s) ECJ(10.82s)
//    C<String> c8 = m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>() )) )) )) )) )) )) )) ); // Javac(79.62s) ECJ(134.64s)
//    C<String> c9 = m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>() )) )) )) )) )) )) )) )) ); // Javac(437s) ECJ(1305s)
//    C<String> c10 = m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>(m(new C<>()))))))))))))))))))); // 3600
//  }
//}
