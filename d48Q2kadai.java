//s23014
//catというクラスにanimalをextendsしてポリモフィズムによりmakeSoundメソッドをニャーと出力するようにしたあとにmainでインスタンス化してメソッドを呼び出した
class Animal {

        public void makeSound() {
                System.out.println("動物の音");
        }

        public void test() {
                System.out.println("テスト出力");
        }
}

class Dog extends Animal {
        public void makeSound() {
                System.out.println("ワンワン");
        }
}
class Cat extends Animal {
	public void makeSound() {
		System.out.println("ニャー");
	}
}

public class d48Q2kadai {
        public static void main(String[] args) {
                Animal a = new Dog();
                a.makeSound();
                a.test();
		Animal b = new Cat();
		b.makeSound();
        }
}

