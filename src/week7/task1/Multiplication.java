package week7.task1;

public class Multiplication extends BinaryExpression {
    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString()+ "*" +right.toString();
    }
}
