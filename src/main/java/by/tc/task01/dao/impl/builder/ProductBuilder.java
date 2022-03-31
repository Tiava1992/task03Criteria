package by.tc.task01.dao.impl.builder;

public abstract class ProductBuilder {
    public Object build() {
        return new Object();
    }

    String[] findParameters(final String lineWithObjectParameters) {
        char[] charArrayFromLine = lineWithObjectParameters.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charArrayFromLine.length; i++) {
            if (charArrayFromLine[i] == '=') {
                while (charArrayFromLine[i] != ',' && i < charArrayFromLine.length - 1) {
                    i++;
                    stringBuilder.append(charArrayFromLine[i]);
                }
            }
        }
        return stringBuilder.toString().split(",");
    }
}
