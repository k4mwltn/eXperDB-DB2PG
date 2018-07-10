package com.k4m.experdb.db2pg.db.oracle.spatial.geometry;

public interface SDO_ETYPE {
	public final static int POINT=1, LINESTRING=2, POLYGON=3, COMPOUNDCURVE=4
			, POLYGON_EXTERIOR=1003, POLYGON_INTERIOR=2003
			, COMPOUND_POLYGON_EXTERIOR=1005, COMPOUND_POLYGON_INTERIOR=2005
			/**
			 * 수정자 : 이재원
			 * 날짜 : 2017-07-03
			 * SURFACE, SOLID 추가 */
			, SURFACE_EXTERIOR=1006, SURFACE_INTERIOR=2006
			, SOLID_EXTERIOR=1007, SOLID_INTERIOR=2007
			, COMPOSITE_SOLID=1008
			;
}