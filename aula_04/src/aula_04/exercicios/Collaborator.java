package aula_04.exercicios;

public class Collaborator {
	private int age;
	private int gender;
	private int stack;

	public Collaborator(int age, int gender, int stack) {
		this.age = age;
		this.gender = gender;
		this.stack = stack;
	}

	public int getAge() {
		return age;
	}

	public int getGender() {
		return gender;
	}

	public int getStack() {
		return stack;
	}

	public boolean getBackend() {
		return this.stack == 1;
	}

	public boolean getMCisAndTransFrontend() {
		if (this.gender == 1 && this.gender == 4 && this.stack == 2) {
			return true;
		} else {
			return false;
		}

	}

	public boolean getHCisAndTransMobileBiggerThan40() {
		if (this.gender == 2 && this.gender == 5 && this.stack == 3 && this.age > 40) {
			return true;
		} else {
			return false;
		}

	}

	public boolean getNoBinaryFullStackLessThan30() {
		if (this.gender == 3 && this.stack == 4 && this.age < 30) {
			return true;
		} else {
			return false;
		}

	}

}
