/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_986_1 extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = -244512768;

	/**
	 * The singleton instance of <code>t_986_1</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.T_986_1 T_986_1 = new org.jooq.test.cubrid.generatedclasses.tables.T_986_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record.class;
	}

	/**
	 * The column <code>t_986_1.ref</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record, java.lang.Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_986_1, "");

	/**
	 * No further instances allowed
	 */
	private T_986_1() {
		this("t_986_1", null);
	}

	private T_986_1(java.lang.String alias, org.jooq.Table<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> aliased) {
		this(alias, aliased, null);
	}

	private T_986_1(java.lang.String alias, org.jooq.Table<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record> getPrimaryKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_986_1__PK_986;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_1Record>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_986_1__PK_986);
	}
}