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
    
真偽値
真偽値にはtrueとfalseという２つの値しか存在しない
trueは正しいfalseは偽
真偽値のデータ型はboolean型

比較演算子
==
!=
x == y xとyが等しいときはtrueが表示され、等しくないときはfalseが表示される
x != y xとyが等しくないときはtrueが表示され、等しいときはfalseが表示される

大小比較

x < y xよりyが大きければtrue 小さいもしくは等しい場合はfalse 
x <= y xよりyが大きいまたは等しければtrue 小さければfalse
> 逆も一緒

System.out.println(4 + 6 <= 10)
等しいのでtrueになる

論理演算子
かつ　または　ではない　を表現する
かつ&&について
trueにさせる
number = 10
System.out.println(number > 3 && number < 11);
条件が１かつ２もtrueであったらtrueになる
なので10は3より大きくてかつ１１より小さいそのためtrueなる

または ||について
System.out.println(number > 3 || number < 5)
10は3より大きいまたは10は５より小さい
どちらかが当てはまっておけばtrue

ではない!()について
x >= 30 xは10、30より小さいそのため結果はfalse
!(x >= 30) !()ではないなので結果はtrue

System.out.println(!(8 < 5));
書くときは（）の中に!（）になるので注意する

条件分岐
if(条件式){
  処理;
}
if文を用いて変数xは2より大きいときxは２より大きいと表示させる
int x = 5
  if(x > 2){
    System.out.println(x + "は2より大きい");
  }

else　else ifについて
もし〜ならばAでなければB

numberが20より小さいとき、どちらでもないときの条件分岐
int number = 12;
 if(number < 10){
   System.out.println(number + "は10より小さい")；
 }else if(number < 20){
   System.out.println(number + "10より大きくは10より小さい")；
 }else{
   System.out.println(number + "は20以上")；
 }
   
   
switch文について
switch文は条件値と値が一致するときに処理が実行される。break;を忘れない。
switch文でどのcaseにも当てはまらないときは、defaultを指定する。これはelseと同じ考え

switch(条件式){
  case 値１:
    処理;
    break;
  case 値２:
    処理;
    break;
  case 値３:
    処理;
    break;
  default:
    処理;
    break;
}

while文について
繰り返し処理とは一定の処理を繰り返し行う処理のこと
int number = 1;①変数の初期化
  while(number <= 5){②条件
    System.out.println("number");③繰り返す処理
    number ++;④変数の更新
  }

for文について
for文も繰り返し処理の一つ
  for(int number = 1; number < 5; number++){
    System.out.println("number");
  }

breakについて
if文などの条件分岐を使って強制終了させることもできる
for(int number = 1; number < 10; number++){
  if(number > 5){
    break;
  } 
    System.out.println("number");
  }
これは↑もし５以上になったらどこで終了

continueについて
コンティニューとは継続という意味、、、そのためもしまるまるに当てはまってもその周の処理だけスキップして継続して処理を行う。
for(int number = 1; number < 10; number++){
  if(number == 5){
    continue;
  } 
    System.out.println("number");
  }

配列とは
変数のセットのようなもの。
配列の変数定義
int[]、、、数値を要素に持つ配列
String[]、、、文字列を要素に持つ配列
配列の作り方
int[] number = {1,2,3,4,5}
インデックス番号と要素の取得
配列名[インデックス番号]とすることで取得することができる
// 変数namesに、配列を代入
int[] names = {"jon","call","tom"};

    // インデックス番号が0の要素を出力
  System.out.println(names[0]);

    // インデックス番号が2の要素
  System.out.println(names[2]); 

配列の要素の上書き
上書きするときは
配列名[上書きしたい元インデックス番号] = "上書き要素";

配列とfor文
 String[] names = {"あみ", "かおる", "こはる"};
    
    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力
    for(String name:names){
      System.out.println("私の名前は" + name + "です");
    }
    
メソッドとクラスについて
メソッドのイメージ
メソッドとは何やらかの処理を割り当てた部品。
これまでmainメソッドだけに記述したきた処理部分をメソッドに切り分けていく。
javaのファイルを実行すると自動的にmainメソッドが実行される。
mainメソッドの処理をメソッドに切り分けるとmainメソッドが各メソッドに指示を出し、
各メソッドの処理が実行するという構造。

メソッドの定義
public static voidの部分は定型として覚える
ブロック（{}で囲まれた部分）の中に、そのメソッドが行う処理を記述する
メソッド名は好きな名前をつけることできる。処理の内容が想像できる名前にする。
メソッドはクラスの中に定義する
メソッドを呼び出すにはメソッド()とするだけ
同名メソッドは基本的に定義できない

1〜10までの数字のうち偶数のみを昇順で表示させる

public class Q_0104 {
	public static void main(String[] args) {
		for(int number = 10; 0 <= number; number--) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
}
1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる

public class Q_0104 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i <=10; i++) {
			if(i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}

public class Q_0104 {
	public static void main(String[] args) {
		int sumEven = 0;
		for(int i = 0;i <= 10; i++) {
			if(i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println(sumEven);
	}
}

1〜10までの整数をカンマ区切りで横並びで表示させる
(10にはカンマをつけない)

public class Q_0104 {
	public static void main(String[] args) {
		for(int i = 0;i <= 10; i++) {
			if(i <= 9) {
				System.out.print(i + ",");
			}else {
				System.out.print(i);
			}
		}
	}
}

配列の中に５ずつ加算していく
public class Q_0104 {
	public static void main(String[] args) {
		int [] number;
		number = new int[20];
		for(int i = 0; i < 20; i++) {
			number[i] = i * 5;
			System.out.println(number[i]);
		}
	}
}

ソースコードの作成
最初にJavaが定める文法に従ってコンピュータへの命令を記述していきます。
「public class~」のような記述で、人が読める状態のプログラムをソースコード、または単にソースと言います。
また、ソースコードを書き込んだファイルのことをソースファイルといい、ファイル名の末尾（拡張子と言います）.javaとする決まり

コンパイル
ソースコードはそのままでは実行できません。そこでまずコンパイルという処理を行い、ソースファイルをクラスファイルに変換します。
クラスファイルは拡張子として.classをつ書くことになっており、ソースコードの各命令をコンピュータが実行しやすいように変換したバイトコードというものが中に詰まっています。
コンパイルはコンパイラというソフトウェアを用いて行いますが、この際にソースコードの文法チェックも行われます。もし誤りがあればコンパイルは失敗し誤りの箇所が指摘される。

実行
バイトコードは、ソースコードに比べて実行に適した姿であるものの、まだ実行することはできない。そこでインタプリタと呼ばれるソフトウェアに対して、バイトコードの変更と実行を依頼する。
インタプリタは内部にJVMという仕組みを持っており、クラスファイル内のバイトコードを少しずつ読みながら、コンピュータの心臓部であるCPUが解釈できるマシンコード（マシン語、機械語とも言われる）
に翻訳すると共にCPUに送って処理を実行させる。
こうしてコンピュータはソースコードで指示した通りに動作する

javaのプログラミングを行うために、私たちはコンパイラとインタプリタを準備する必要がある。
開発環境の整備
