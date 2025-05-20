package com.ksudoku.enums;

public enum Cells {
	CELL_1("C1"), CELL_2("C2"), CELL_3("C3"), CELL_4("C4"), CELL_5("C5"), CELL_6("C6"), CELL_7("C7"), CELL_8("C8"),
	CELL_9("C9"), CELL_10("C10"), CELL_11("C11"), CELL_12("C12"), CELL_13("C13"), CELL_14("C14"), CELL_15("C15"),
	CELL_16("C16"), CELL_17("C17"), CELL_18("C18"), CELL_19("C19"), CELL_20("C20"), CELL_21("C21"), CELL_22("C22"),
	CELL_23("C23"), CELL_24("C24"), CELL_25("C25"), CELL_26("C26"), CELL_27("C27"), CELL_28("C28"), CELL_29("C29"),
	CELL_30("C30"), CELL_31("C31"), CELL_32("C32"), CELL_33("C33"), CELL_34("C34"), CELL_35("C35"), CELL_36("C36"),
	CELL_37("C37"), CELL_38("C38"), CELL_39("C39"), CELL_40("C40"), CELL_41("C41"), CELL_42("C42"), CELL_43("C43"),
	CELL_44("C44"), CELL_45("C45"), CELL_46("C46"), CELL_47("C47"), CELL_48("C48"), CELL_49("C49"), CELL_50("C50"),
	CELL_51("C51"), CELL_52("C52"), CELL_53("C53"), CELL_54("C54"), CELL_55("C55"), CELL_56("C56"), CELL_57("C57"),
	CELL_58("C58"), CELL_59("C59"), CELL_60("C60"), CELL_61("C61"), CELL_62("C62"), CELL_63("C63"), CELL_64("C64"),
	CELL_65("C65"), CELL_66("C66"), CELL_67("C67"), CELL_68("C68"), CELL_69("C69"), CELL_70("C70"), CELL_71("C71"),
	CELL_72("C72"), CELL_73("C73"), CELL_74("C74"), CELL_75("C75"), CELL_76("C76"), CELL_77("C77"), CELL_78("C78"),
	CELL_79("C79"), CELL_80("C80"), CELL_81("C81");

	private final String value;

	Cells(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
