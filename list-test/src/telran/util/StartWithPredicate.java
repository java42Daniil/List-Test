package telran.util;

import java.util.function.Predicate;

public class StartWithPredicate implements Predicate<String> {
private String prefix;

	public StartWithPredicate(String prefix) {
	this.prefix = prefix;
}

	@Override
	public boolean test(String t) {
		
		return t.startsWith(prefix);
	}

}