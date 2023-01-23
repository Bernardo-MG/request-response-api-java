/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2023 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bernardomg.api.response;

import java.util.Collection;

import com.bernardomg.api.error.Error;
import com.bernardomg.api.pagination.PageInformation;
import com.bernardomg.api.sort.Sort;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * Default implementation of the paginated response.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 *
 * @param <T>
 *            response content type
 */
@Data
@Builder
public final class DefaultResponse<T> implements PaginatedResponse<T>, ErrorResponse<T>, SortedResponse<T> {

    /**
     * Response content.
     */
    @NonNull
    private T                content;

    private Error            error;

    private PageInformation  pageData;

    private String           path;

    private Collection<Sort> sorting;

    private Integer          status;

}
