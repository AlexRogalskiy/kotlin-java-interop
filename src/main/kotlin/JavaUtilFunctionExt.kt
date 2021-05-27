package io.toolisticon.kotlin

import java.util.function.*
import java.util.function.Function

object JavaUtilFunctionExt {

  operator fun <T : Any?> Consumer<T>.invoke(t: T) = this.accept(t)
  operator fun <T : Any?, U : Any?> BiConsumer<T, U>.invoke(t: T, u: U): Unit = this.accept(t, u)

  operator fun <T : Any?, R : Any?> Function<T, R>.invoke(t: T): R = this.apply(t)
  operator fun <T : Any?, U : Any?, R : Any?> BiFunction<T, U, R>.invoke(t: T, u: U): R = this.apply(t, u)
  operator fun <T : Any?> BinaryOperator<T>.invoke(t1: T, t2: T): T = this.apply(t1, t2)
  operator fun <T : Any?> UnaryOperator<T>.invoke(t: T): T = this.apply(t)

  operator fun <T : Any?> Predicate<T>.invoke(t: T): Boolean = this.test(t)
  operator fun <T : Any?, U : Any?> BiPredicate<T, U>.invoke(t: T, u: U): Boolean = this.test(t, u)

  operator fun BooleanSupplier.invoke(): Boolean = this.asBoolean
  operator fun <T : Any?> Supplier<T>.invoke(): T = this.get()

//  DoubleBinaryOperator
//  DoubleConsumer
//  DoubleFunction
//  DoublePredicate
//  DoubleSupplier
//  DoubleToIntFunction
//  DoubleToLongFunction
//  DoubleUnaryOperator
//  IntBinaryOperator
//  IntConsumer
//  IntFunction
//  IntPredicate
//  IntSupplier
//  IntToDoubleFunction
//  IntToLongFunction
//  IntUnaryOperator
//  LongBinaryOperator
//  LongConsumer
//  LongFunction
//  LongPredicate
//  LongSupplier
//  LongToDoubleFunction
//  LongToIntFunction
//  LongUnaryOperator
//  ObjDoubleConsumer
//  ObjIntConsumer
//  ObjLongConsumer
//  ToDoubleBiFunction
//  ToDoubleFunction
//  ToIntBiFunction
//  ToIntFunction
//  ToLongBiFunction
//  ToLongFunction


}
