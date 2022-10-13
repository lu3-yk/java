class Main {
  public static void main(String[] args) {

    // この文章をコメントにしてください

    // 「こんにちは、Java」と出力してください
    System.out.println("こんにちは、Java");

  }
}

System.out.println()の()の中に文字を書くとコンソールにその文字が表示される。
文字列はダブルクォーテーションで囲ってあげる""
javaの終わりにはセミコロンを忘れない;
数値はダブルクォーテーションで囲まない
記号 + - の間には半角スペースを入れた方がわかりやすい
足し算＋
引き算ー
掛け算＊
割り算/
割り算の余％
System.out.println("5"+"3");とすると53と表示される
文字列や数値はデータ型と呼ばれる
int  数値
String  文字列初めは大文字
変数とはデータをいれておく箱
変数を使うには変数を定義する必要がある
javaで変数を定義するためには、①変数に入れる値のデータを指定する②変数の名前を決める
①int ②number;
①String ②name;
変数を定義したら変数に値を入れる。これを代入という。
変数名＝値
変数の定義と同時に値を代入することができる
int number = 3 ;
また変数を使って計算や文字列をつなげて表示することもできる
int number = 3 ;
 System.out.println(number + 2);

String greeting = "こんにちは";
String name = "鈴木さん";
  System.out.println(greeting + name);

変数の上書き
値を上書きするときはデータ型をつけない
int number = 3;
  number = 4;
System.out.println(number);

自己代入
int number = 3;
  number = number + 4;
System.out.println(number);

省略形の書き方
X = X + 10; 略すると→ X += 10;
X = X - 10; 略すると→ X -= 10;
X = X * 10; 略すると→ X *= 10;
X = X / 10; 略すると→ X /= 10;
X = X % 10; 略すると→ X %= 10;
X = X + 1; 略すると→ X++;
X = X - 1; 略すると→ X--;

なぜ変数を使うのか
１、何のデータか分かり易い
２、同じデータを繰り返し使える
３、変更に対応しやすい

変数の注意点
英単語を用いるdate
2語以上は大文字で区切る(キャメルケース)userName

整数はint 小数にはdouble　を使う
double number = 2.1;
 System.out.println(number);

int同士の計算も小数点をつけることでdoubleにできる
System.out.println(7/2.0);

データ型で計算したいときは(変換したいデータ型)値にする
 int number1 = 7;
    int number2 = 2;
    System.out.println((double)number1 / number2);
    