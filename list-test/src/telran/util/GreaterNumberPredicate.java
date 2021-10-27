package telran.util;

import java.util.function.Predicate;

public class GreaterNumberPredicate implements Predicate<Integer> {
private Integer number;

	public GreaterNumberPredicate(Integer number) {
	this.number = number;
}

	@Override
	public boolean test(Integer t) {
		return t > number;
	}

}