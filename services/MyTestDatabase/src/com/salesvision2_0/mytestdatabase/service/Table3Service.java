/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/
package com.salesvision2_0.mytestdatabase.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.salesvision2_0.mytestdatabase.Table3;

/**
 * Service object for domain model class {@link Table3}.
 */
public interface Table3Service {

    /**
     * Creates a new Table3. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table3 if any.
     *
     * @param table3 Details of the Table3 to be created; value cannot be null.
     * @return The newly created Table3.
     */
	Table3 create(Table3 table3);


	/**
	 * Returns Table3 by given id if exists.
	 *
	 * @param table3Id The id of the Table3 to get; value cannot be null.
	 * @return Table3 associated with the given table3Id.
     * @throws EntityNotFoundException If no Table3 is found.
	 */
	Table3 getById(Integer table3Id) throws EntityNotFoundException;

    /**
	 * Find and return the Table3 by given id if exists, returns null otherwise.
	 *
	 * @param table3Id The id of the Table3 to get; value cannot be null.
	 * @return Table3 associated with the given table3Id.
	 */
	Table3 findById(Integer table3Id);


	/**
	 * Updates the details of an existing Table3. It replaces all fields of the existing Table3 with the given table3.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Table3 if any.
     *
	 * @param table3 The details of the Table3 to be updated; value cannot be null.
	 * @return The updated Table3.
	 * @throws EntityNotFoundException if no Table3 is found with given input.
	 */
	Table3 update(Table3 table3) throws EntityNotFoundException;

    /**
	 * Deletes an existing Table3 with the given id.
	 *
	 * @param table3Id The id of the Table3 to be deleted; value cannot be null.
	 * @return The deleted Table3.
	 * @throws EntityNotFoundException if no Table3 found with the given id.
	 */
	Table3 delete(Integer table3Id) throws EntityNotFoundException;

	/**
	 * Find all Table3s matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table3s.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Table3> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Table3s matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table3s.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Table3> findAll(String query, Pageable pageable);

    /**
	 * Exports all Table3s matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Table3s in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Table3.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}
