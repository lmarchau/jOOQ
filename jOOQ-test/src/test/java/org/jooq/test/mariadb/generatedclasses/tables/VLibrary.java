/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mariadb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -1021826553;

	/**
	 * The singleton instance of <code>test.v_library</code>
	 */
	public static final org.jooq.test.mariadb.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.mariadb.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>test.v_library.AUTHOR</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(101), V_LIBRARY, "");

	/**
	 * The column <code>test.v_library.TITLE</code>. The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), V_LIBRARY, "The book's title");

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		this("v_library", null);
	}

	private VLibrary(java.lang.String alias, org.jooq.Table<org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord> aliased) {
		this(alias, aliased, null);
	}

	private VLibrary(java.lang.String alias, org.jooq.Table<org.jooq.test.mariadb.generatedclasses.tables.records.VLibraryRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mariadb.generatedclasses.Test.TEST, aliased, parameters, "VIEW");
	}
}