package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListTest {
private List<Integer> numbers;
private List<String> strings;
Integer initialNumbers[] = {10, 20, 40};
String initialStrings[] = {"name1", "name2"};
	@BeforeEach
	void setUp() throws Exception {
		numbers = getInitialNumbers();
		strings = getInitialStrings();
	}

	private List<String> getInitialStrings() {
		List<String> res = new ArrayList<>();
		for (int i = 0; i < initialStrings.length; i++) {
			res.add(initialStrings[i]);
		}
		return res;
	}

	private List<Integer> getInitialNumbers() {
		List<Integer> res = new ArrayList<>(1);
		for (int i = 0; i < initialNumbers.length; i++) {
			res.add(initialNumbers[i]);
		}
		return res;
	}

	@Test
	void testGet() {
		assertEquals(10, numbers.get(0));
		assertEquals("name1", strings.get(0));
		assertEquals(null, numbers.get(-1));
		assertEquals(null, numbers.get(3));
	}

	@Test
	void testAddIndex() {
		assertEquals(true, strings.add(0, "name3"));
		assertEquals("name3", strings.get(0));		
		assertEquals(false, strings.add(5, "name4"));
		assertEquals(true, strings.add(3, "name4"));
		assertEquals(false, strings.add(-1, "name4"));
		//[YG] not enough. Let's say from your code you remove essential lines "arraycopy" and size++, then your test nevertheless will pass, however functionulity is incorrect
	}

	@Test
	void testRemove() {
		//YG run the following test ArrayInteger<Integer> arT = new Array<Integer>(1); arT.add(1); arT.remove(0); ... see what will be.
		assertEquals(10, numbers.remove(0));
		assertEquals(2, numbers.size());
		assertEquals(null, numbers.remove(4));
		//[YG] not enough. Let's say from your code you remove your lines of the loop "for" (lines 71-74 of ArrayList). That is, you do nothing (no remove). but test will pass
	}
}
