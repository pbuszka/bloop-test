piotr@host:~/testing/bloop-test$ bloop clean root
piotr@host:~/testing/bloop-test$ bloop clean dep
piotr@host:~/testing/bloop-test$ bloop compile root
Compiling 1 Scala source to /home/piotr/testing/bloop-test/.bloop/dep/scala-2.12/classes ...
Done compiling.
Compiling 1 Scala source to /home/piotr/testing/bloop-test/.bloop/root/scala-2.12/classes ...
Done compiling.
piotr@host:~/testing/bloop-test$ 

Here change the content of Dep.scala to:
object Dep {
  def fun(i: String) = s"i"
}

piotr@host:~/testing/bloop-test$ bloop compile root
Compiling 1 Scala source to /home/piotr/testing/bloop-test/.bloop/dep/scala-2.12/classes ...
Done compiling.
piotr@host:~/testing/bloop-test$ 
piotr@host:~/testing/bloop-test$ bloop clean root
piotr@host:~/testing/bloop-test$ 
piotr@host:~/testing/bloop-test$ bloop compile root
Compiling 1 Scala source to /home/piotr/testing/bloop-test/.bloop/root/scala-2.12/classes ...
[E] [E1] src/main/scala/TestRoot.scala:2:19
[E]      type mismatch;
[E]       found   : Int(1)
[E]       required: String
[E]      L2:   println(Dep.fun(1))
[E]                            ^
[E] src/main/scala/TestRoot.scala: L2 [E1]
[E] 'root' failed to compile.
piotr@host:~/testing/bloop-test$ 
