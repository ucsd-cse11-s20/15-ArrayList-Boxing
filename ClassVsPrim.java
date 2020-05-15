
class Pair<TypeOfA, TypeOfB> {
  TypeOfA a;
  TypeOfB b;
  Pair(TypeOfA a, TypeOfB b) {
    this.a = a;
    this.b = b;
  }
}

public class ClassVsPrim {
  // Pair<int, int> p = new Pair<int, int>(56, 5);
  // Integer i = new Integer(45);
  // This means the same thing as above
  Integer i = 45;

  Integer i2 = i + 3;

  int n = i2;

  int n2 = i2.intValue();

  Pair<Integer, Boolean> p = new Pair<>(45, true);
}