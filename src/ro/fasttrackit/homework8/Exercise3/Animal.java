package ro.fasttrackit.homework8.Exercise3;

/* Create an interface that describes how an Animal behaves: walk(), talk(), eat().
Provide implementations: Cat, Dog, Mouse, Chicken, Duck.
The implementations will just return a string:
	eg. class Cat{ public String walk(){
	return "cat-walking";}} */

public interface Animal {

	String walk();

	String talk();

	String eat();
}
