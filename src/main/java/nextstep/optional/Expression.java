package nextstep.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression expression, String expressionString) {
        return expressionString.equals(expression.expression);
    }

    static Expression of(String expressionString) {

        List<Optional<Expression>> optionalList = Arrays.stream(values())
                .map(Optional::ofNullable)
                .collect(Collectors.toList());

        List<Expression> expressionList = optionalList.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        return expressionList.stream()
                .filter(expression -> matchExpression(expression, expressionString))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s는 사칙연산에 해당하지 않는 표현식입니다.", expressionString)));
    }
}
