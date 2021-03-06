/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2021.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2021-03-06             liwen   Create the class
 * http://www.jimilab.com/
 */


package com.vv.cloud.eureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

/**
 * @author liwen
 * @date 2021-03-06
 * @since 1.0.0
 */
@Component
public class TestEvent {

    public void listen(EurekaInstanceCanceledEvent event) {
        // 发送邮件、短信
        System.out.println("服务下线" + event.getServerId());
    }
}
