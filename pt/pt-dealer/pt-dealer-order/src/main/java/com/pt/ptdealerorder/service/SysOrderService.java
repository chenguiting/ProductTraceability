/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pt.ptdealerorder.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pt.ptdealerorder.entity.Query;
import com.pt.ptdealerorder.entity.SysOrder;

/**
 *
 *
 * @author pig code generator
 * @date 2020-04-29 19:37:32
 */
public interface SysOrderService extends IService<SysOrder> {
	IPage getSysOrderPage(Page page, Query query);
	Boolean saveOrder(SysOrder sysOrder);
	Boolean updateOrder(SysOrder sysOrder);
	Boolean changeCheckFlag(Integer orderId, String checkFlag);
}
