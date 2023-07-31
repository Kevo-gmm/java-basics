// Operator precedence determines the order in which operators are evaluated in expressions. It defines which operators have higher priority over others when multiple operators are used in a single expression. When evaluating an expression, Java follows specific rules to determine the sequence in which operators are applied. Understanding operator precedence is crucial to write correct and predictable code.

// Rules of Operator Precedence:

// Parentheses ( ): Expressions within parentheses are evaluated first, and they have the highest precedence. Parentheses can be used to override default precedence and enforce the evaluation order.

// Postfix operators: expr++, expr-- (e.g., a++, b--) are evaluated next. The postfix operators increment or decrement the value of the variable after the expression is evaluated.

// Unary operators: ++expr, --expr, +expr, -expr, !expr, ~expr are evaluated next. Unary operators act on a single operand.

// Multiplicative operators: *, /, % are evaluated from left to right.

// Additive operators: +, - are evaluated from left to right.

// Shift operators: <<, >>, >>> are evaluated from left to right.

// Relational operators: <, >, <=, >=, instanceof are evaluated from left to right.

// Equality operators: ==, != are evaluated from left to right.

// Bitwise AND operator: & is evaluated from left to right.

// Bitwise XOR operator: ^ is evaluated from left to right.

// Bitwise OR operator: | is evaluated from left to right.

// Logical AND operator: && is evaluated from left to right.

// Logical OR operator: || is evaluated from left to right.

// Conditional (ternary) operator: ? : is evaluated from left to right.

// Assignment operators: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>= are evaluated from right to left.

// - Operators with higher precedence are evaluated first.
// - When operators have the same precedence, their associativity comes into play. For example, the associative property of addition allows it to be evaluated from left to right (`a + b + c` is evaluated as `(a + b) + c`).


public class OperatorPrecedence {
    
}
