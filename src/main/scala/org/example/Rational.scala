package org.example

import scala.annotation.tailrec
import scala.language.implicitConversions

/**
 * 有理数
 *
 * @param numerator   分子
 * @param denominator 分母
 */
class Rational(val numerator: Int, val denominator: Int) {
  require(denominator != 0)

  /**
   * 分母为1的有理数
   *
   * @param numerator 分子
   */
  def this(numerator: Int) = this(numerator, 1)

  /**
   * 取相反数
   *
   * @return -this
   */
  def unary_-(): Rational = Rational(-this.numerator, this.denominator)

  /**
   * 加法
   *
   * @return this + other
   */
  def +(other: Rational): Rational =
    Rational(
      this.numerator * other.denominator + other.numerator * this.denominator,
      this.denominator * other.denominator
    )

  /**
   * 减法
   *
   * @return this - other
   */
  def -(other: Rational): Rational = this + -other

  /**
   * 乘法
   *
   * @return this * other
   */
  def *(other: Rational): Rational =
    Rational(
      this.numerator * other.numerator,
      this.denominator * other.denominator
    )

  /**
   * 除法
   *
   * @return this / other
   */
  def /(other: Rational): Rational =
    Rational(
      this.numerator * other.denominator,
      this.denominator * other.numerator
    )

  override def toString: String = s"$numerator/$denominator"
}

object Rational {
  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def apply(int: Int): Rational = new Rational(int)

  def apply(numerator: Int, denominator: Int): Rational = {
    val g = gcd(numerator, denominator)
    new Rational(numerator / g, denominator / g)
  }

  def unapply(rational: Rational): Option[(Int, Int)] = {
    Option((rational.numerator, rational.denominator))
  }

  /**
   * 将整数转换为有理数
   */
  implicit def intToRational(int: Int): Rational = Rational(int)
}