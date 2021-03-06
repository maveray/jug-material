package jug.streams;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class ListUtils {

	// goodbye sweet prince
	public static <T> List<T> filterList(List<T> original, Predicate<T> filter) {
		Objects.requireNonNull(original);
		Objects.requireNonNull(filter);
		List<T> result = Lists.newArrayList();
		for (T one : original) {
			if (filter.test(one)) {
				result.add(one);
			}
		}
		return result;
	}

	// goodbye sweet prince
	public static <T, U> List<U> transformList(List<T> original, Function<T, U> function) {
		Objects.requireNonNull(original);
		Objects.requireNonNull(function);
		List<U> result = Lists.newArrayList();
		for (T one : original) {
			result.add(function.apply(one));
		}
		return result;
	}

	@SafeVarargs
	public static <E> List<E> list(E... elements) {
		return ImmutableList.copyOf(elements);
	}
}
