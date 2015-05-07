package snakecamel;

public class Main {
	public static void main(String[] args) {
			SnakeCamelUtil snakeCamelUtil = new SnakeCamelUtil();
			System.out.println(snakeCamelUtil.snakeToCamelcase("abc"));
			System.out.println(snakeCamelUtil.snakeToCamelcase("abc_def"));
			System.out.println(snakeCamelUtil.snakeToCamelcase("abc_def_gh"));
			System.out.println(snakeCamelUtil.snakeToCamelcase("abc__def___gh"));
			System.out.println(snakeCamelUtil.snakeToCamelcase("_abc_def__"));
			
			System.out.println(snakeCamelUtil.camelToSnakecase("Abc"));
			System.out.println(snakeCamelUtil.camelToSnakecase("AbcDef"));
			System.out.println(snakeCamelUtil.camelToSnakecase("AbcDefGh"));
			
			System.out.println(snakeCamelUtil.capitalize(" "));
			System.out.println(snakeCamelUtil.capitalize("a"));
			System.out.println(snakeCamelUtil.capitalize("xyz"));
			
			System.out.println(snakeCamelUtil.uncapitalize(" "));
			System.out.println(snakeCamelUtil.uncapitalize("A"));
			System.out.println(snakeCamelUtil.uncapitalize("Xyz"));
	}
}
