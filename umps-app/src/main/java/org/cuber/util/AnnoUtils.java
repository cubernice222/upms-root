package org.cuber.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AnnoUtils {

    private static Logger logger = LoggerFactory.getLogger(AnnoUtils.class);

    public static Object findFieldValueWithAnno(Object obj, Class<? extends Annotation> annotationClass){
        List<Field> list = Arrays.asList(obj.getClass().getDeclaredFields());
        if(Objects.nonNull(list)){
            Field findField = list.stream().filter(field ->
                field.isAnnotationPresent(annotationClass)
            ).findFirst().get();
            if(Objects.nonNull(findField)){
                findField.setAccessible(true);
                try{
                    return findField.get(obj);
                }catch (Exception e){
                    logger.error("获取属性出错", e);
                }
            }
        }
        return null;
    }

    public static <T> List<Field> fetchAllFiled(Class<T> tCls){
        List<Field> list = new ArrayList<>();
        Class<?> cls = tCls;
        while(true){
            logger.info("----" + cls);
            if(cls != Object.class){
                list.addAll(Arrays.asList(cls.getDeclaredFields()));
            }else{
                break;
            }
            cls = cls.getSuperclass();
        }
        return list;
    }

}
