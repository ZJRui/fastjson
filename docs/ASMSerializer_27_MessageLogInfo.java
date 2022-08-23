
ClassLoader:                                                                    
+-com.alibaba.fastjson.util.ASMClassLoader@30b3942f                             
  +-sun.misc.Launcher$AppClassLoader@18b4aac2                                   
    +-sun.misc.Launcher$ExtClassLoader@439f1423                                 

Location:                                                                       
/Users/dz0400847/.m2/repository/com/alibaba/fastjson/1.2.67/fastjson-1.2.67.jar 

/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  com.yupaopao.hug.room.base.domain.logrecord.HermesLog
 *  com.yupaopao.hug.room.base.domain.logrecord.MessageLogInfo
 */
package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerialContext;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.ASMUtils;
import com.yupaopao.hug.room.base.domain.logrecord.HermesLog;
import com.yupaopao.hug.room.base.domain.logrecord.MessageLogInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

public class ASMSerializer_27_MessageLogInfo
extends JavaBeanSerializer
implements ObjectSerializer {
    public Type createTime_asm_fieldType = ASMUtils.getMethodType(HermesLog.class, "getCreateTime");
    public ObjectSerializer createTime_asm_ser_;
    public Type hermesCreateTime_asm_fieldType = ASMUtils.getMethodType(HermesLog.class, "getHermesCreateTime");
    public ObjectSerializer hermesCreateTime_asm_ser_;

    public ASMSerializer_27_MessageLogInfo(SerializeBeanInfo serializeBeanInfo) {
        super(serializeBeanInfo);
    }

    public void write(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        if (object == null) {
            jSONSerializer.writeNull();
            return;
        }
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (!this.writeDirect(jSONSerializer)) {
            this.writeNormal(jSONSerializer, object, object2, type, n);
            return;
        }
        if (serializeWriter.isEnabled(32768)) {
            this.writeDirectNonContext(jSONSerializer, object, object2, type, n);
            return;
        }
        //public class MessageLogInfo extends HermesLog implements Serializable
        MessageLogInfo messageLogInfo = (MessageLogInfo)object;
        if (this.writeReference(jSONSerializer, object, n)) {
            return;
        }
        if (serializeWriter.isEnabled(0x200000)) {
            this.writeAsArray(jSONSerializer, object, object2, type, n);
            return;
        }
        SerialContext serialContext = jSONSerializer.getContext();
        jSONSerializer.setContext(serialContext, object, object2, 0);
        int n2 = 123;
        String string = "addColumn";
        boolean bl = messageLogInfo.isAddColumn();
        serializeWriter.writeFieldValue((char)n2, string, bl);
        n2 = 44;
        string = "createTime";
        Date date = messageLogInfo.getCreateTime();
        if (date == null) {
            if (serializeWriter.isEnabled(964)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 0);
                n2 = 44;
            }
        } else {
            serializeWriter.write(n2);
            serializeWriter.writeFieldNameDirect(string);
            jSONSerializer.writeWithFieldName(date, string, this.createTime_asm_fieldType, 0);
            n2 = 44;
        }
        string = "data";
        String string2 = messageLogInfo.getData();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "hermesCreateTime";
        date = messageLogInfo.getHermesCreateTime();
        if (date == null) {
            if (serializeWriter.isEnabled(964)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 0);
                n2 = 44;
            }
        } else {
            serializeWriter.write(n2);
            serializeWriter.writeFieldNameDirect(string);
            jSONSerializer.writeWithFieldName(date, string, this.hermesCreateTime_asm_fieldType, 0);
            n2 = 44;
        }
        string = "info";
        string2 = messageLogInfo.getInfo();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "messageId";
        string2 = messageLogInfo.getMessageId();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "result";
        string2 = messageLogInfo.getResult();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "roomId";
        string2 = messageLogInfo.getRoomId();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "tableName";
        string2 = messageLogInfo.getTableName();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "type";
        string2 = messageLogInfo.getType();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "uid";
        string2 = messageLogInfo.getUid();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        if (n2 == 123) {
            serializeWriter.write(123);
        }
        serializeWriter.write(125);
        jSONSerializer.setContext(serialContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeNormal(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        int n2;
        SerialContext serialContext;
        SerializeWriter serializeWriter;
        block113: {
            String string;
            String string2;
            block114: {
                Object object3;
                Object object4;
                Object object5;
                boolean bl;
                boolean bl2;
                MessageLogInfo messageLogInfo;
                block111: {
                    block112: {
                        block109: {
                            block110: {
                                block107: {
                                    block108: {
                                        block105: {
                                            block106: {
                                                block103: {
                                                    block104: {
                                                        block101: {
                                                            block102: {
                                                                block99: {
                                                                    block100: {
                                                                        block97: {
                                                                            block98: {
                                                                                block95: {
                                                                                    block96: {
                                                                                        block92: {
                                                                                            boolean bl3;
                                                                                            block94: {
                                                                                                block93: {
                                                                                                    int n3;
                                                                                                    if (object == null) {
                                                                                                        jSONSerializer.writeNull();
                                                                                                        return;
                                                                                                    }
                                                                                                    serializeWriter = jSONSerializer.out;
                                                                                                    if (!serializeWriter.isSortField()) {
                                                                                                        this.writeUnsorted(jSONSerializer, object, object2, type, n);
                                                                                                        return;
                                                                                                    }
                                                                                                    messageLogInfo = (MessageLogInfo)object;
                                                                                                    if (serializeWriter.isEnabled(8192) || serializeWriter.isEnabled(0x8000000)) {
                                                                                                        super.write(jSONSerializer, object, object2, type, n);
                                                                                                        return;
                                                                                                    }
                                                                                                    if (this.writeReference(jSONSerializer, object, n)) {
                                                                                                        return;
                                                                                                    }
                                                                                                    if (serializeWriter.isEnabled(0x200000)) {
                                                                                                        this.writeAsArrayNormal(jSONSerializer, object, object2, type, n);
                                                                                                        return;
                                                                                                    }
                                                                                                    serialContext = jSONSerializer.getContext();
                                                                                                    jSONSerializer.setContext(serialContext, object, object2, 0);
                                                                                                    if (jSONSerializer.isWriteClassName(type, object) && type != object.getClass()) {
                                                                                                        serializeWriter.write(123);
                                                                                                        this.writeClassName(jSONSerializer, null, object);
                                                                                                        n3 = 44;
                                                                                                    } else {
                                                                                                        n3 = 123;
                                                                                                    }
                                                                                                    n2 = n3;
                                                                                                    n2 = this.writeBefore(jSONSerializer, object, (char)n2);
                                                                                                    bl2 = serializeWriter.isNotWriteDefaultValue();
                                                                                                    boolean bl4 = jSONSerializer.checkValue(this);
                                                                                                    bl = jSONSerializer.hasNameFilters(this);
                                                                                                    string2 = "addColumn";
                                                                                                    if (!this.applyName(jSONSerializer, object, string2) || !this.applyLabel(jSONSerializer, "")) break block92;
                                                                                                    bl3 = messageLogInfo.isAddColumn();
                                                                                                    if (bl2 && !bl3 || !this.apply(jSONSerializer, object, string2, bl3)) break block92;
                                                                                                    if (bl) {
                                                                                                        string2 = this.processKey(jSONSerializer, object, string2, bl3);
                                                                                                    }
                                                                                                    if (bl4) break block93;
                                                                                                    object5 = null;
                                                                                                    object4 = null;
                                                                                                    break block94;
                                                                                                }
                                                                                                object5 = bl3;
                                                                                                if (object5 == (object4 = this.processValue(jSONSerializer, this.getBeanContext(0), object, string2, object5))) break block94;
                                                                                                object3 = object4;
                                                                                                if (object3 == null) {
                                                                                                    if (serializeWriter.isEnabled(964)) {
                                                                                                        serializeWriter.write(n2);
                                                                                                        serializeWriter.writeFieldName(string2, false);
                                                                                                        serializeWriter.writeNull(0, 0);
                                                                                                        n2 = 44;
                                                                                                    }
                                                                                                    break block92;
                                                                                                } else {
                                                                                                    serializeWriter.write(n2);
                                                                                                    serializeWriter.writeFieldName(string2, false);
                                                                                                    jSONSerializer.writeWithFieldName(object4, string2);
                                                                                                    n2 = 44;
                                                                                                }
                                                                                                break block92;
                                                                                            }
                                                                                            serializeWriter.writeFieldValue((char)n2, string2, bl3);
                                                                                            n2 = 44;
                                                                                        }
                                                                                        if (!this.applyName(jSONSerializer, object, string2 = "createTime") || !this.applyLabel(jSONSerializer, "")) break block95;
                                                                                        object3 = messageLogInfo.getCreateTime();
                                                                                        if (bl2) {
                                                                                            // empty if block
                                                                                        }
                                                                                        if (!this.apply(jSONSerializer, object, string2, object3)) break block95;
                                                                                        if (bl) {
                                                                                            string2 = this.processKey(jSONSerializer, object, string2, object3);
                                                                                        }
                                                                                        if ((object5 = object3) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(1), object, string2, object5))) break block96;
                                                                                        object3 = object4;
                                                                                        if (object3 == null) {
                                                                                            if (serializeWriter.isEnabled(964)) {
                                                                                                serializeWriter.write(n2);
                                                                                                serializeWriter.writeFieldName(string2, false);
                                                                                                serializeWriter.writeNull(0, 0);
                                                                                                n2 = 44;
                                                                                            }
                                                                                            break block95;
                                                                                        } else {
                                                                                            serializeWriter.write(n2);
                                                                                            serializeWriter.writeFieldName(string2, false);
                                                                                            jSONSerializer.writeWithFieldName(object4, string2, this.createTime_asm_fieldType, 0);
                                                                                            n2 = 44;
                                                                                        }
                                                                                        break block95;
                                                                                    }
                                                                                    object3 = object4;
                                                                                    if (object3 == null) {
                                                                                        if (serializeWriter.isEnabled(964)) {
                                                                                            serializeWriter.write(n2);
                                                                                            serializeWriter.writeFieldName(string2, false);
                                                                                            serializeWriter.writeNull(0, 0);
                                                                                            n2 = 44;
                                                                                        }
                                                                                    } else {
                                                                                        serializeWriter.write(n2);
                                                                                        serializeWriter.writeFieldName(string2, false);
                                                                                        jSONSerializer.writeWithFieldName(object4, string2, this.createTime_asm_fieldType, 0);
                                                                                        n2 = 44;
                                                                                    }
                                                                                }
                                                                                if (!this.applyName(jSONSerializer, object, string2 = "data") || !this.applyLabel(jSONSerializer, "")) break block97;
                                                                                string = messageLogInfo.getData();
                                                                                if (bl2) {
                                                                                    // empty if block
                                                                                }
                                                                                if (!this.apply(jSONSerializer, object, string2, string)) break block97;
                                                                                if (bl) {
                                                                                    string2 = this.processKey(jSONSerializer, object, string2, string);
                                                                                }
                                                                                if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(2), object, string2, object5))) break block98;
                                                                                object3 = object4;
                                                                                if (object3 == null) {
                                                                                    if (serializeWriter.isEnabled(132)) {
                                                                                        serializeWriter.write(n2);
                                                                                        serializeWriter.writeFieldName(string2, false);
                                                                                        serializeWriter.writeNull(0, 128);
                                                                                        n2 = 44;
                                                                                    }
                                                                                    break block97;
                                                                                } else {
                                                                                    serializeWriter.write(n2);
                                                                                    serializeWriter.writeFieldName(string2, false);
                                                                                    jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                                                                                    n2 = 44;
                                                                                }
                                                                                break block97;
                                                                            }
                                                                            if (string == null) {
                                                                                if (serializeWriter.isEnabled(132)) {
                                                                                    serializeWriter.write(n2);
                                                                                    serializeWriter.writeFieldName(string2, false);
                                                                                    serializeWriter.writeNull(0, 128);
                                                                                    n2 = 44;
                                                                                }
                                                                            } else {
                                                                                serializeWriter.writeFieldValue((char)n2, string2, string);
                                                                                n2 = 44;
                                                                            }
                                                                        }
                                                                        if (!this.applyName(jSONSerializer, object, string2 = "hermesCreateTime") || !this.applyLabel(jSONSerializer, "")) break block99;
                                                                        object3 = messageLogInfo.getHermesCreateTime();
                                                                        if (bl2) {
                                                                            // empty if block
                                                                        }
                                                                        if (!this.apply(jSONSerializer, object, string2, object3)) break block99;
                                                                        if (bl) {
                                                                            string2 = this.processKey(jSONSerializer, object, string2, object3);
                                                                        }
                                                                        if ((object5 = object3) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(3), object, string2, object5))) break block100;
                                                                        object3 = object4;
                                                                        if (object3 == null) {
                                                                            if (serializeWriter.isEnabled(964)) {
                                                                                serializeWriter.write(n2);
                                                                                serializeWriter.writeFieldName(string2, false);
                                                                                serializeWriter.writeNull(0, 0);
                                                                                n2 = 44;
                                                                            }
                                                                            break block99;
                                                                        } else {
                                                                            serializeWriter.write(n2);
                                                                            serializeWriter.writeFieldName(string2, false);
                                                                            jSONSerializer.writeWithFieldName(object4, string2, this.hermesCreateTime_asm_fieldType, 0);
                                                                            n2 = 44;
                                                                        }
                                                                        break block99;
                                                                    }
                                                                    object3 = object4;
                                                                    if (object3 == null) {
                                                                        if (serializeWriter.isEnabled(964)) {
                                                                            serializeWriter.write(n2);
                                                                            serializeWriter.writeFieldName(string2, false);
                                                                            serializeWriter.writeNull(0, 0);
                                                                            n2 = 44;
                                                                        }
                                                                    } else {
                                                                        serializeWriter.write(n2);
                                                                        serializeWriter.writeFieldName(string2, false);
                                                                        jSONSerializer.writeWithFieldName(object4, string2, this.hermesCreateTime_asm_fieldType, 0);
                                                                        n2 = 44;
                                                                    }
                                                                }
                                                                if (!this.applyName(jSONSerializer, object, string2 = "info") || !this.applyLabel(jSONSerializer, "")) break block101;
                                                                string = messageLogInfo.getInfo();
                                                                if (bl2) {
                                                                    // empty if block
                                                                }
                                                                if (!this.apply(jSONSerializer, object, string2, string)) break block101;
                                                                if (bl) {
                                                                    string2 = this.processKey(jSONSerializer, object, string2, string);
                                                                }
                                                                if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(4), object, string2, object5))) break block102;
                                                                object3 = object4;
                                                                if (object3 == null) {
                                                                    if (serializeWriter.isEnabled(132)) {
                                                                        serializeWriter.write(n2);
                                                                        serializeWriter.writeFieldName(string2, false);
                                                                        serializeWriter.writeNull(0, 128);
                                                                        n2 = 44;
                                                                    }
                                                                    break block101;
                                                                } else {
                                                                    serializeWriter.write(n2);
                                                                    serializeWriter.writeFieldName(string2, false);
                                                                    jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                                                                    n2 = 44;
                                                                }
                                                                break block101;
                                                            }
                                                            if (string == null) {
                                                                if (serializeWriter.isEnabled(132)) {
                                                                    serializeWriter.write(n2);
                                                                    serializeWriter.writeFieldName(string2, false);
                                                                    serializeWriter.writeNull(0, 128);
                                                                    n2 = 44;
                                                                }
                                                            } else {
                                                                serializeWriter.writeFieldValue((char)n2, string2, string);
                                                                n2 = 44;
                                                            }
                                                        }
                                                        if (!this.applyName(jSONSerializer, object, string2 = "messageId") || !this.applyLabel(jSONSerializer, "")) break block103;
                                                        string = messageLogInfo.getMessageId();
                                                        if (bl2) {
                                                            // empty if block
                                                        }
                                                        if (!this.apply(jSONSerializer, object, string2, string)) break block103;
                                                        if (bl) {
                                                            string2 = this.processKey(jSONSerializer, object, string2, string);
                                                        }
                                                        if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(5), object, string2, object5))) break block104;
                                                        object3 = object4;
                                                        if (object3 == null) {
                                                            if (serializeWriter.isEnabled(132)) {
                                                                serializeWriter.write(n2);
                                                                serializeWriter.writeFieldName(string2, false);
                                                                serializeWriter.writeNull(0, 128);
                                                                n2 = 44;
                                                            }
                                                            break block103;
                                                        } else {
                                                            serializeWriter.write(n2);
                                                            serializeWriter.writeFieldName(string2, false);
                                                            jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                                                            n2 = 44;
                                                        }
                                                        break block103;
                                                    }
                                                    if (string == null) {
                                                        if (serializeWriter.isEnabled(132)) {
                                                            serializeWriter.write(n2);
                                                            serializeWriter.writeFieldName(string2, false);
                                                            serializeWriter.writeNull(0, 128);
                                                            n2 = 44;
                                                        }
                                                    } else {
                                                        serializeWriter.writeFieldValue((char)n2, string2, string);
                                                        n2 = 44;
                                                    }
                                                }
                                                if (!this.applyName(jSONSerializer, object, string2 = "result") || !this.applyLabel(jSONSerializer, "")) break block105;
                                                string = messageLogInfo.getResult();
                                                if (bl2) {
                                                    // empty if block
                                                }
                                                if (!this.apply(jSONSerializer, object, string2, string)) break block105;
                                                if (bl) {
                                                    string2 = this.processKey(jSONSerializer, object, string2, string);
                                                }
                                                if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(6), object, string2, object5))) break block106;
                                                object3 = object4;
                                                if (object3 == null) {
                                                    if (serializeWriter.isEnabled(132)) {
                                                        serializeWriter.write(n2);
                                                        serializeWriter.writeFieldName(string2, false);
                                                        serializeWriter.writeNull(0, 128);
                                                        n2 = 44;
                                                    }
                                                    break block105;
                                                } else {
                                                    serializeWriter.write(n2);
                                                    serializeWriter.writeFieldName(string2, false);
                                                    jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                                                    n2 = 44;
                                                }
                                                break block105;
                                            }
                                            if (string == null) {
                                                if (serializeWriter.isEnabled(132)) {
                                                    serializeWriter.write(n2);
                                                    serializeWriter.writeFieldName(string2, false);
                                                    serializeWriter.writeNull(0, 128);
                                                    n2 = 44;
                                                }
                                            } else {
                                                serializeWriter.writeFieldValue((char)n2, string2, string);
                                                n2 = 44;
                                            }
                                        }
                                        if (!this.applyName(jSONSerializer, object, string2 = "roomId") || !this.applyLabel(jSONSerializer, "")) break block107;
                                        string = messageLogInfo.getRoomId();
                                        if (bl2) {
                                            // empty if block
                                        }
                                        if (!this.apply(jSONSerializer, object, string2, string)) break block107;
                                        if (bl) {
                                            string2 = this.processKey(jSONSerializer, object, string2, string);
                                        }
                                        if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(7), object, string2, object5))) break block108;
                                        object3 = object4;
                                        if (object3 == null) {
                                            if (serializeWriter.isEnabled(132)) {
                                                serializeWriter.write(n2);
                                                serializeWriter.writeFieldName(string2, false);
                                                serializeWriter.writeNull(0, 128);
                                                n2 = 44;
                                            }
                                            break block107;
                                        } else {
                                            serializeWriter.write(n2);
                                            serializeWriter.writeFieldName(string2, false);
                                            jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                                            n2 = 44;
                                        }
                                        break block107;
                                    }
                                    if (string == null) {
                                        if (serializeWriter.isEnabled(132)) {
                                            serializeWriter.write(n2);
                                            serializeWriter.writeFieldName(string2, false);
                                            serializeWriter.writeNull(0, 128);
                                            n2 = 44;
                                        }
                                    } else {
                                        serializeWriter.writeFieldValue((char)n2, string2, string);
                                        n2 = 44;
                                    }
                                }
                                if (!this.applyName(jSONSerializer, object, string2 = "tableName") || !this.applyLabel(jSONSerializer, "")) break block109;
                                string = messageLogInfo.getTableName();
                                if (bl2) {
                                    // empty if block
                                }
                                if (!this.apply(jSONSerializer, object, string2, string)) break block109;
                                if (bl) {
                                    string2 = this.processKey(jSONSerializer, object, string2, string);
                                }
                                if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(8), object, string2, object5))) break block110;
                                object3 = object4;
                                if (object3 == null) {
                                    if (serializeWriter.isEnabled(132)) {
                                        serializeWriter.write(n2);
                                        serializeWriter.writeFieldName(string2, false);
                                        serializeWriter.writeNull(0, 128);
                                        n2 = 44;
                                    }
                                    break block109;
                                } else {
                                    serializeWriter.write(n2);
                                    serializeWriter.writeFieldName(string2, false);
                                    jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                                    n2 = 44;
                                }
                                break block109;
                            }
                            if (string == null) {
                                if (serializeWriter.isEnabled(132)) {
                                    serializeWriter.write(n2);
                                    serializeWriter.writeFieldName(string2, false);
                                    serializeWriter.writeNull(0, 128);
                                    n2 = 44;
                                }
                            } else {
                                serializeWriter.writeFieldValue((char)n2, string2, string);
                                n2 = 44;
                            }
                        }
                        if (!this.applyName(jSONSerializer, object, string2 = "type") || !this.applyLabel(jSONSerializer, "")) break block111;
                        string = messageLogInfo.getType();
                        if (bl2) {
                            // empty if block
                        }
                        if (!this.apply(jSONSerializer, object, string2, string)) break block111;
                        if (bl) {
                            string2 = this.processKey(jSONSerializer, object, string2, string);
                        }
                        if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(9), object, string2, object5))) break block112;
                        object3 = object4;
                        if (object3 == null) {
                            if (serializeWriter.isEnabled(132)) {
                                serializeWriter.write(n2);
                                serializeWriter.writeFieldName(string2, false);
                                serializeWriter.writeNull(0, 128);
                                n2 = 44;
                            }
                            break block111;
                        } else {
                            serializeWriter.write(n2);
                            serializeWriter.writeFieldName(string2, false);
                            jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                            n2 = 44;
                        }
                        break block111;
                    }
                    if (string == null) {
                        if (serializeWriter.isEnabled(132)) {
                            serializeWriter.write(n2);
                            serializeWriter.writeFieldName(string2, false);
                            serializeWriter.writeNull(0, 128);
                            n2 = 44;
                        }
                    } else {
                        serializeWriter.writeFieldValue((char)n2, string2, string);
                        n2 = 44;
                    }
                }
                if (!this.applyName(jSONSerializer, object, string2 = "uid") || !this.applyLabel(jSONSerializer, "")) break block113;
                string = messageLogInfo.getUid();
                if (bl2) {
                    // empty if block
                }
                if (!this.apply(jSONSerializer, object, string2, string)) break block113;
                if (bl) {
                    string2 = this.processKey(jSONSerializer, object, string2, string);
                }
                if ((object5 = string) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(10), object, string2, object5))) break block114;
                object3 = object4;
                if (object3 == null) {
                    if (serializeWriter.isEnabled(132)) {
                        serializeWriter.write(n2);
                        serializeWriter.writeFieldName(string2, false);
                        serializeWriter.writeNull(0, 128);
                        n2 = 44;
                    }
                    break block113;
                } else {
                    serializeWriter.write(n2);
                    serializeWriter.writeFieldName(string2, false);
                    jSONSerializer.writeWithFieldName(object4, string2, (Type)((Object)String.class), 0);
                    n2 = 44;
                }
                break block113;
            }
            if (string == null) {
                if (serializeWriter.isEnabled(132)) {
                    serializeWriter.write(n2);
                    serializeWriter.writeFieldName(string2, false);
                    serializeWriter.writeNull(0, 128);
                    n2 = 44;
                }
            } else {
                serializeWriter.writeFieldValue((char)n2, string2, string);
                n2 = 44;
            }
        }
        if ((n2 = this.writeAfter(jSONSerializer, object, (char)n2)) == 123) {
            serializeWriter.write(123);
        }
        serializeWriter.write(125);
        jSONSerializer.setContext(serialContext);
    }

    public void writeDirectNonContext(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        if (object == null) {
            jSONSerializer.writeNull();
            return;
        }
        SerializeWriter serializeWriter = jSONSerializer.out;
        MessageLogInfo messageLogInfo = (MessageLogInfo)object;
        if (serializeWriter.isEnabled(0x200000)) {
            this.writeAsArrayNonContext(jSONSerializer, object, object2, type, n);
            return;
        }
        int n2 = 123;
        String string = "addColumn";
        boolean bl = messageLogInfo.isAddColumn();
        serializeWriter.writeFieldValue((char)n2, string, bl);
        n2 = 44;
        string = "createTime";
        Date date = messageLogInfo.getCreateTime();
        if (date == null) {
            if (serializeWriter.isEnabled(964)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 0);
                n2 = 44;
            }
        } else {
            serializeWriter.write(n2);
            serializeWriter.writeFieldNameDirect(string);
            jSONSerializer.writeWithFieldName(date, string, this.createTime_asm_fieldType, 0);
            n2 = 44;
        }
        string = "data";
        String string2 = messageLogInfo.getData();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "hermesCreateTime";
        date = messageLogInfo.getHermesCreateTime();
        if (date == null) {
            if (serializeWriter.isEnabled(964)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 0);
                n2 = 44;
            }
        } else {
            serializeWriter.write(n2);
            serializeWriter.writeFieldNameDirect(string);
            jSONSerializer.writeWithFieldName(date, string, this.hermesCreateTime_asm_fieldType, 0);
            n2 = 44;
        }
        string = "info";
        string2 = messageLogInfo.getInfo();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "messageId";
        string2 = messageLogInfo.getMessageId();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "result";
        string2 = messageLogInfo.getResult();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "roomId";
        string2 = messageLogInfo.getRoomId();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "tableName";
        string2 = messageLogInfo.getTableName();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "type";
        string2 = messageLogInfo.getType();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        string = "uid";
        string2 = messageLogInfo.getUid();
        if (string2 == null) {
            if (serializeWriter.isEnabled(132)) {
                serializeWriter.write(n2);
                serializeWriter.writeFieldNameDirect(string);
                serializeWriter.writeNull(0, 128);
                n2 = 44;
            }
        } else {
            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck((char)n2, string, string2);
            n2 = 44;
        }
        if (n2 == 123) {
            serializeWriter.write(123);
        }
        serializeWriter.write(125);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeUnsorted(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        int n2;
        SerialContext serialContext;
        SerializeWriter serializeWriter;
        block111: {
            Object object3;
            Object object4;
            String string;
            block112: {
                Object object5;
                boolean bl;
                boolean bl2;
                MessageLogInfo messageLogInfo;
                block108: {
                    boolean bl3;
                    block110: {
                        block109: {
                            boolean bl4;
                            block106: {
                                String string2;
                                block107: {
                                    block104: {
                                        block105: {
                                            block102: {
                                                block103: {
                                                    block100: {
                                                        block101: {
                                                            block98: {
                                                                block99: {
                                                                    block96: {
                                                                        block97: {
                                                                            block94: {
                                                                                block95: {
                                                                                    block92: {
                                                                                        block93: {
                                                                                            block90: {
                                                                                                block91: {
                                                                                                    int n3;
                                                                                                    serializeWriter = jSONSerializer.out;
                                                                                                    messageLogInfo = (MessageLogInfo)object;
                                                                                                    if (serializeWriter.isEnabled(8192) || serializeWriter.isEnabled(0x8000000)) {
                                                                                                        super.write(jSONSerializer, object, object2, type, n);
                                                                                                        return;
                                                                                                    }
                                                                                                    if (this.writeReference(jSONSerializer, object, n)) {
                                                                                                        return;
                                                                                                    }
                                                                                                    if (serializeWriter.isEnabled(0x200000)) {
                                                                                                        this.writeAsArrayNormal(jSONSerializer, object, object2, type, n);
                                                                                                        return;
                                                                                                    }
                                                                                                    serialContext = jSONSerializer.getContext();
                                                                                                    jSONSerializer.setContext(serialContext, object, object2, 0);
                                                                                                    if (jSONSerializer.isWriteClassName(type, object) && type != object.getClass()) {
                                                                                                        serializeWriter.write(123);
                                                                                                        this.writeClassName(jSONSerializer, null, object);
                                                                                                        n3 = 44;
                                                                                                    } else {
                                                                                                        n3 = 123;
                                                                                                    }
                                                                                                    n2 = n3;
                                                                                                    n2 = this.writeBefore(jSONSerializer, object, (char)n2);
                                                                                                    bl2 = serializeWriter.isNotWriteDefaultValue();
                                                                                                    bl4 = jSONSerializer.checkValue(this);
                                                                                                    bl = jSONSerializer.hasNameFilters(this);
                                                                                                    string = "info";
                                                                                                    if (!this.applyName(jSONSerializer, object, string) || !this.applyLabel(jSONSerializer, "")) break block90;
                                                                                                    string2 = messageLogInfo.getInfo();
                                                                                                    if (bl2) {
                                                                                                        // empty if block
                                                                                                    }
                                                                                                    if (!this.apply(jSONSerializer, object, string, string2)) break block90;
                                                                                                    if (bl) {
                                                                                                        string = this.processKey(jSONSerializer, object, string, string2);
                                                                                                    }
                                                                                                    if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(4), object, string, object5))) break block91;
                                                                                                    object3 = object4;
                                                                                                    if (object3 == null) {
                                                                                                        if (serializeWriter.isEnabled(132)) {
                                                                                                            serializeWriter.write(n2);
                                                                                                            serializeWriter.writeFieldName(string, false);
                                                                                                            serializeWriter.writeNull(0, 128);
                                                                                                            n2 = 44;
                                                                                                        }
                                                                                                        break block90;
                                                                                                    } else {
                                                                                                        serializeWriter.write(n2);
                                                                                                        serializeWriter.writeFieldName(string, false);
                                                                                                        jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                                                                        n2 = 44;
                                                                                                    }
                                                                                                    break block90;
                                                                                                }
                                                                                                if (string2 == null) {
                                                                                                    if (serializeWriter.isEnabled(132)) {
                                                                                                        serializeWriter.write(n2);
                                                                                                        serializeWriter.writeFieldName(string, false);
                                                                                                        serializeWriter.writeNull(0, 128);
                                                                                                        n2 = 44;
                                                                                                    }
                                                                                                } else {
                                                                                                    serializeWriter.writeFieldValue((char)n2, string, string2);
                                                                                                    n2 = 44;
                                                                                                }
                                                                                            }
                                                                                            if (!this.applyName(jSONSerializer, object, string = "data") || !this.applyLabel(jSONSerializer, "")) break block92;
                                                                                            string2 = messageLogInfo.getData();
                                                                                            if (bl2) {
                                                                                                // empty if block
                                                                                            }
                                                                                            if (!this.apply(jSONSerializer, object, string, string2)) break block92;
                                                                                            if (bl) {
                                                                                                string = this.processKey(jSONSerializer, object, string, string2);
                                                                                            }
                                                                                            if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(2), object, string, object5))) break block93;
                                                                                            object3 = object4;
                                                                                            if (object3 == null) {
                                                                                                if (serializeWriter.isEnabled(132)) {
                                                                                                    serializeWriter.write(n2);
                                                                                                    serializeWriter.writeFieldName(string, false);
                                                                                                    serializeWriter.writeNull(0, 128);
                                                                                                    n2 = 44;
                                                                                                }
                                                                                                break block92;
                                                                                            } else {
                                                                                                serializeWriter.write(n2);
                                                                                                serializeWriter.writeFieldName(string, false);
                                                                                                jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                                                                n2 = 44;
                                                                                            }
                                                                                            break block92;
                                                                                        }
                                                                                        if (string2 == null) {
                                                                                            if (serializeWriter.isEnabled(132)) {
                                                                                                serializeWriter.write(n2);
                                                                                                serializeWriter.writeFieldName(string, false);
                                                                                                serializeWriter.writeNull(0, 128);
                                                                                                n2 = 44;
                                                                                            }
                                                                                        } else {
                                                                                            serializeWriter.writeFieldValue((char)n2, string, string2);
                                                                                            n2 = 44;
                                                                                        }
                                                                                    }
                                                                                    if (!this.applyName(jSONSerializer, object, string = "messageId") || !this.applyLabel(jSONSerializer, "")) break block94;
                                                                                    string2 = messageLogInfo.getMessageId();
                                                                                    if (bl2) {
                                                                                        // empty if block
                                                                                    }
                                                                                    if (!this.apply(jSONSerializer, object, string, string2)) break block94;
                                                                                    if (bl) {
                                                                                        string = this.processKey(jSONSerializer, object, string, string2);
                                                                                    }
                                                                                    if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(5), object, string, object5))) break block95;
                                                                                    object3 = object4;
                                                                                    if (object3 == null) {
                                                                                        if (serializeWriter.isEnabled(132)) {
                                                                                            serializeWriter.write(n2);
                                                                                            serializeWriter.writeFieldName(string, false);
                                                                                            serializeWriter.writeNull(0, 128);
                                                                                            n2 = 44;
                                                                                        }
                                                                                        break block94;
                                                                                    } else {
                                                                                        serializeWriter.write(n2);
                                                                                        serializeWriter.writeFieldName(string, false);
                                                                                        jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                                                        n2 = 44;
                                                                                    }
                                                                                    break block94;
                                                                                }
                                                                                if (string2 == null) {
                                                                                    if (serializeWriter.isEnabled(132)) {
                                                                                        serializeWriter.write(n2);
                                                                                        serializeWriter.writeFieldName(string, false);
                                                                                        serializeWriter.writeNull(0, 128);
                                                                                        n2 = 44;
                                                                                    }
                                                                                } else {
                                                                                    serializeWriter.writeFieldValue((char)n2, string, string2);
                                                                                    n2 = 44;
                                                                                }
                                                                            }
                                                                            if (!this.applyName(jSONSerializer, object, string = "type") || !this.applyLabel(jSONSerializer, "")) break block96;
                                                                            string2 = messageLogInfo.getType();
                                                                            if (bl2) {
                                                                                // empty if block
                                                                            }
                                                                            if (!this.apply(jSONSerializer, object, string, string2)) break block96;
                                                                            if (bl) {
                                                                                string = this.processKey(jSONSerializer, object, string, string2);
                                                                            }
                                                                            if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(9), object, string, object5))) break block97;
                                                                            object3 = object4;
                                                                            if (object3 == null) {
                                                                                if (serializeWriter.isEnabled(132)) {
                                                                                    serializeWriter.write(n2);
                                                                                    serializeWriter.writeFieldName(string, false);
                                                                                    serializeWriter.writeNull(0, 128);
                                                                                    n2 = 44;
                                                                                }
                                                                                break block96;
                                                                            } else {
                                                                                serializeWriter.write(n2);
                                                                                serializeWriter.writeFieldName(string, false);
                                                                                jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                                                n2 = 44;
                                                                            }
                                                                            break block96;
                                                                        }
                                                                        if (string2 == null) {
                                                                            if (serializeWriter.isEnabled(132)) {
                                                                                serializeWriter.write(n2);
                                                                                serializeWriter.writeFieldName(string, false);
                                                                                serializeWriter.writeNull(0, 128);
                                                                                n2 = 44;
                                                                            }
                                                                        } else {
                                                                            serializeWriter.writeFieldValue((char)n2, string, string2);
                                                                            n2 = 44;
                                                                        }
                                                                    }
                                                                    if (!this.applyName(jSONSerializer, object, string = "result") || !this.applyLabel(jSONSerializer, "")) break block98;
                                                                    string2 = messageLogInfo.getResult();
                                                                    if (bl2) {
                                                                        // empty if block
                                                                    }
                                                                    if (!this.apply(jSONSerializer, object, string, string2)) break block98;
                                                                    if (bl) {
                                                                        string = this.processKey(jSONSerializer, object, string, string2);
                                                                    }
                                                                    if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(6), object, string, object5))) break block99;
                                                                    object3 = object4;
                                                                    if (object3 == null) {
                                                                        if (serializeWriter.isEnabled(132)) {
                                                                            serializeWriter.write(n2);
                                                                            serializeWriter.writeFieldName(string, false);
                                                                            serializeWriter.writeNull(0, 128);
                                                                            n2 = 44;
                                                                        }
                                                                        break block98;
                                                                    } else {
                                                                        serializeWriter.write(n2);
                                                                        serializeWriter.writeFieldName(string, false);
                                                                        jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                                        n2 = 44;
                                                                    }
                                                                    break block98;
                                                                }
                                                                if (string2 == null) {
                                                                    if (serializeWriter.isEnabled(132)) {
                                                                        serializeWriter.write(n2);
                                                                        serializeWriter.writeFieldName(string, false);
                                                                        serializeWriter.writeNull(0, 128);
                                                                        n2 = 44;
                                                                    }
                                                                } else {
                                                                    serializeWriter.writeFieldValue((char)n2, string, string2);
                                                                    n2 = 44;
                                                                }
                                                            }
                                                            if (!this.applyName(jSONSerializer, object, string = "uid") || !this.applyLabel(jSONSerializer, "")) break block100;
                                                            string2 = messageLogInfo.getUid();
                                                            if (bl2) {
                                                                // empty if block
                                                            }
                                                            if (!this.apply(jSONSerializer, object, string, string2)) break block100;
                                                            if (bl) {
                                                                string = this.processKey(jSONSerializer, object, string, string2);
                                                            }
                                                            if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(10), object, string, object5))) break block101;
                                                            object3 = object4;
                                                            if (object3 == null) {
                                                                if (serializeWriter.isEnabled(132)) {
                                                                    serializeWriter.write(n2);
                                                                    serializeWriter.writeFieldName(string, false);
                                                                    serializeWriter.writeNull(0, 128);
                                                                    n2 = 44;
                                                                }
                                                                break block100;
                                                            } else {
                                                                serializeWriter.write(n2);
                                                                serializeWriter.writeFieldName(string, false);
                                                                jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                                n2 = 44;
                                                            }
                                                            break block100;
                                                        }
                                                        if (string2 == null) {
                                                            if (serializeWriter.isEnabled(132)) {
                                                                serializeWriter.write(n2);
                                                                serializeWriter.writeFieldName(string, false);
                                                                serializeWriter.writeNull(0, 128);
                                                                n2 = 44;
                                                            }
                                                        } else {
                                                            serializeWriter.writeFieldValue((char)n2, string, string2);
                                                            n2 = 44;
                                                        }
                                                    }
                                                    if (!this.applyName(jSONSerializer, object, string = "roomId") || !this.applyLabel(jSONSerializer, "")) break block102;
                                                    string2 = messageLogInfo.getRoomId();
                                                    if (bl2) {
                                                        // empty if block
                                                    }
                                                    if (!this.apply(jSONSerializer, object, string, string2)) break block102;
                                                    if (bl) {
                                                        string = this.processKey(jSONSerializer, object, string, string2);
                                                    }
                                                    if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(7), object, string, object5))) break block103;
                                                    object3 = object4;
                                                    if (object3 == null) {
                                                        if (serializeWriter.isEnabled(132)) {
                                                            serializeWriter.write(n2);
                                                            serializeWriter.writeFieldName(string, false);
                                                            serializeWriter.writeNull(0, 128);
                                                            n2 = 44;
                                                        }
                                                        break block102;
                                                    } else {
                                                        serializeWriter.write(n2);
                                                        serializeWriter.writeFieldName(string, false);
                                                        jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                                        n2 = 44;
                                                    }
                                                    break block102;
                                                }
                                                if (string2 == null) {
                                                    if (serializeWriter.isEnabled(132)) {
                                                        serializeWriter.write(n2);
                                                        serializeWriter.writeFieldName(string, false);
                                                        serializeWriter.writeNull(0, 128);
                                                        n2 = 44;
                                                    }
                                                } else {
                                                    serializeWriter.writeFieldValue((char)n2, string, string2);
                                                    n2 = 44;
                                                }
                                            }
                                            if (!this.applyName(jSONSerializer, object, string = "createTime") || !this.applyLabel(jSONSerializer, "")) break block104;
                                            object3 = messageLogInfo.getCreateTime();
                                            if (bl2) {
                                                // empty if block
                                            }
                                            if (!this.apply(jSONSerializer, object, string, object3)) break block104;
                                            if (bl) {
                                                string = this.processKey(jSONSerializer, object, string, object3);
                                            }
                                            if ((object5 = object3) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(1), object, string, object5))) break block105;
                                            object3 = object4;
                                            if (object3 == null) {
                                                if (serializeWriter.isEnabled(964)) {
                                                    serializeWriter.write(n2);
                                                    serializeWriter.writeFieldName(string, false);
                                                    serializeWriter.writeNull(0, 0);
                                                    n2 = 44;
                                                }
                                                break block104;
                                            } else {
                                                serializeWriter.write(n2);
                                                serializeWriter.writeFieldName(string, false);
                                                jSONSerializer.writeWithFieldName(object4, string, this.createTime_asm_fieldType, 0);
                                                n2 = 44;
                                            }
                                            break block104;
                                        }
                                        object3 = object4;
                                        if (object3 == null) {
                                            if (serializeWriter.isEnabled(964)) {
                                                serializeWriter.write(n2);
                                                serializeWriter.writeFieldName(string, false);
                                                serializeWriter.writeNull(0, 0);
                                                n2 = 44;
                                            }
                                        } else {
                                            serializeWriter.write(n2);
                                            serializeWriter.writeFieldName(string, false);
                                            jSONSerializer.writeWithFieldName(object4, string, this.createTime_asm_fieldType, 0);
                                            n2 = 44;
                                        }
                                    }
                                    if (!this.applyName(jSONSerializer, object, string = "tableName") || !this.applyLabel(jSONSerializer, "")) break block106;
                                    string2 = messageLogInfo.getTableName();
                                    if (bl2) {
                                        // empty if block
                                    }
                                    if (!this.apply(jSONSerializer, object, string, string2)) break block106;
                                    if (bl) {
                                        string = this.processKey(jSONSerializer, object, string, string2);
                                    }
                                    if ((object5 = string2) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(8), object, string, object5))) break block107;
                                    object3 = object4;
                                    if (object3 == null) {
                                        if (serializeWriter.isEnabled(132)) {
                                            serializeWriter.write(n2);
                                            serializeWriter.writeFieldName(string, false);
                                            serializeWriter.writeNull(0, 128);
                                            n2 = 44;
                                        }
                                        break block106;
                                    } else {
                                        serializeWriter.write(n2);
                                        serializeWriter.writeFieldName(string, false);
                                        jSONSerializer.writeWithFieldName(object4, string, (Type)((Object)String.class), 0);
                                        n2 = 44;
                                    }
                                    break block106;
                                }
                                if (string2 == null) {
                                    if (serializeWriter.isEnabled(132)) {
                                        serializeWriter.write(n2);
                                        serializeWriter.writeFieldName(string, false);
                                        serializeWriter.writeNull(0, 128);
                                        n2 = 44;
                                    }
                                } else {
                                    serializeWriter.writeFieldValue((char)n2, string, string2);
                                    n2 = 44;
                                }
                            }
                            if (!this.applyName(jSONSerializer, object, string = "addColumn") || !this.applyLabel(jSONSerializer, "")) break block108;
                            bl3 = messageLogInfo.isAddColumn();
                            if (bl2 && !bl3 || !this.apply(jSONSerializer, object, string, bl3)) break block108;
                            if (bl) {
                                string = this.processKey(jSONSerializer, object, string, bl3);
                            }
                            if (bl4) break block109;
                            object5 = null;
                            object4 = null;
                            break block110;
                        }
                        object5 = bl3;
                        if (object5 == (object4 = this.processValue(jSONSerializer, this.getBeanContext(0), object, string, object5))) break block110;
                        object3 = object4;
                        if (object3 == null) {
                            if (serializeWriter.isEnabled(964)) {
                                serializeWriter.write(n2);
                                serializeWriter.writeFieldName(string, false);
                                serializeWriter.writeNull(0, 0);
                                n2 = 44;
                            }
                            break block108;
                        } else {
                            serializeWriter.write(n2);
                            serializeWriter.writeFieldName(string, false);
                            jSONSerializer.writeWithFieldName(object4, string);
                            n2 = 44;
                        }
                        break block108;
                    }
                    serializeWriter.writeFieldValue((char)n2, string, bl3);
                    n2 = 44;
                }
                if (!this.applyName(jSONSerializer, object, string = "hermesCreateTime") || !this.applyLabel(jSONSerializer, "")) break block111;
                object3 = messageLogInfo.getHermesCreateTime();
                if (bl2) {
                    // empty if block
                }
                if (!this.apply(jSONSerializer, object, string, object3)) break block111;
                if (bl) {
                    string = this.processKey(jSONSerializer, object, string, object3);
                }
                if ((object5 = object3) == (object4 = this.processValue(jSONSerializer, this.getBeanContext(3), object, string, object5))) break block112;
                object3 = object4;
                if (object3 == null) {
                    if (serializeWriter.isEnabled(964)) {
                        serializeWriter.write(n2);
                        serializeWriter.writeFieldName(string, false);
                        serializeWriter.writeNull(0, 0);
                        n2 = 44;
                    }
                    break block111;
                } else {
                    serializeWriter.write(n2);
                    serializeWriter.writeFieldName(string, false);
                    jSONSerializer.writeWithFieldName(object4, string, this.hermesCreateTime_asm_fieldType, 0);
                    n2 = 44;
                }
                break block111;
            }
            object3 = object4;
            if (object3 == null) {
                if (serializeWriter.isEnabled(964)) {
                    serializeWriter.write(n2);
                    serializeWriter.writeFieldName(string, false);
                    serializeWriter.writeNull(0, 0);
                    n2 = 44;
                }
            } else {
                serializeWriter.write(n2);
                serializeWriter.writeFieldName(string, false);
                jSONSerializer.writeWithFieldName(object4, string, this.hermesCreateTime_asm_fieldType, 0);
                n2 = 44;
            }
        }
        if ((n2 = this.writeAfter(jSONSerializer, object, (char)n2)) == 123) {
            serializeWriter.write(123);
        }
        serializeWriter.write(125);
        jSONSerializer.setContext(serialContext);
    }

    public void writeAsArray(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        ObjectSerializer objectSerializer;
        SerializeWriter serializeWriter = jSONSerializer.out;
        MessageLogInfo messageLogInfo = (MessageLogInfo)object;
        if (!jSONSerializer.hasPropertyFilters(this)) {
            super.writeNoneASM(jSONSerializer, object, object2, type, n);
            return;
        }
        serializeWriter.write(91);
        String string = "addColumn";
        SerializeWriter serializeWriter2 = serializeWriter;
        serializeWriter2.write(messageLogInfo.isAddColumn());
        serializeWriter2.write(44);
        string = "createTime";
        Date date = messageLogInfo.getCreateTime();
        if (date == null) {
            serializeWriter.writeNull();
        } else if (date.getClass() == Date.class) {
            if (this.createTime_asm_ser_ == null) {
                this.createTime_asm_ser_ = jSONSerializer.getObjectWriter(Date.class);
            }
            if ((objectSerializer = this.createTime_asm_ser_) instanceof JavaBeanSerializer) {
                ((JavaBeanSerializer)objectSerializer).writeAsArrayNonContext(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            } else {
                objectSerializer.write(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            }
        } else {
            jSONSerializer.writeWithFieldName(date, string, this.createTime_asm_fieldType, 0);
        }
        serializeWriter.write(44);
        string = "data";
        serializeWriter.writeString(messageLogInfo.getData(), ',');
        string = "hermesCreateTime";
        date = messageLogInfo.getHermesCreateTime();
        if (date == null) {
            serializeWriter.writeNull();
        } else if (date.getClass() == Date.class) {
            if (this.hermesCreateTime_asm_ser_ == null) {
                this.hermesCreateTime_asm_ser_ = jSONSerializer.getObjectWriter(Date.class);
            }
            if ((objectSerializer = this.hermesCreateTime_asm_ser_) instanceof JavaBeanSerializer) {
                ((JavaBeanSerializer)objectSerializer).writeAsArrayNonContext(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            } else {
                objectSerializer.write(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            }
        } else {
            jSONSerializer.writeWithFieldName(date, string, this.hermesCreateTime_asm_fieldType, 0);
        }
        serializeWriter.write(44);
        string = "info";
        serializeWriter.writeString(messageLogInfo.getInfo(), ',');
        string = "messageId";
        serializeWriter.writeString(messageLogInfo.getMessageId(), ',');
        string = "result";
        serializeWriter.writeString(messageLogInfo.getResult(), ',');
        string = "roomId";
        serializeWriter.writeString(messageLogInfo.getRoomId(), ',');
        string = "tableName";
        serializeWriter.writeString(messageLogInfo.getTableName(), ',');
        string = "type";
        serializeWriter.writeString(messageLogInfo.getType(), ',');
        string = "uid";
        serializeWriter.writeString(messageLogInfo.getUid(), ']');
    }

    public void writeAsArrayNormal(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        ObjectSerializer objectSerializer;
        SerializeWriter serializeWriter = jSONSerializer.out;
        MessageLogInfo messageLogInfo = (MessageLogInfo)object;
        if (!jSONSerializer.hasPropertyFilters(this)) {
            super.writeNoneASM(jSONSerializer, object, object2, type, n);
            return;
        }
        serializeWriter.write(91);
        String string = "addColumn";
        SerializeWriter serializeWriter2 = serializeWriter;
        serializeWriter2.write(messageLogInfo.isAddColumn());
        serializeWriter2.write(44);
        string = "createTime";
        Date date = messageLogInfo.getCreateTime();
        if (date == null) {
            serializeWriter.writeNull();
        } else if (date.getClass() == Date.class) {
            if (this.createTime_asm_ser_ == null) {
                this.createTime_asm_ser_ = jSONSerializer.getObjectWriter(Date.class);
            }
            objectSerializer = this.createTime_asm_ser_;
            objectSerializer.write(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
        } else {
            jSONSerializer.writeWithFieldName(date, string, this.createTime_asm_fieldType, 0);
        }
        serializeWriter.write(44);
        string = "data";
        serializeWriter.writeString(messageLogInfo.getData(), ',');
        string = "hermesCreateTime";
        date = messageLogInfo.getHermesCreateTime();
        if (date == null) {
            serializeWriter.writeNull();
        } else if (date.getClass() == Date.class) {
            if (this.hermesCreateTime_asm_ser_ == null) {
                this.hermesCreateTime_asm_ser_ = jSONSerializer.getObjectWriter(Date.class);
            }
            objectSerializer = this.hermesCreateTime_asm_ser_;
            objectSerializer.write(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
        } else {
            jSONSerializer.writeWithFieldName(date, string, this.hermesCreateTime_asm_fieldType, 0);
        }
        serializeWriter.write(44);
        string = "info";
        serializeWriter.writeString(messageLogInfo.getInfo(), ',');
        string = "messageId";
        serializeWriter.writeString(messageLogInfo.getMessageId(), ',');
        string = "result";
        serializeWriter.writeString(messageLogInfo.getResult(), ',');
        string = "roomId";
        serializeWriter.writeString(messageLogInfo.getRoomId(), ',');
        string = "tableName";
        serializeWriter.writeString(messageLogInfo.getTableName(), ',');
        string = "type";
        serializeWriter.writeString(messageLogInfo.getType(), ',');
        string = "uid";
        serializeWriter.writeString(messageLogInfo.getUid(), ']');
    }

    public void writeAsArrayNonContext(JSONSerializer jSONSerializer, Object object, Object object2, Type type, int n) throws IOException {
        ObjectSerializer objectSerializer;
        SerializeWriter serializeWriter = jSONSerializer.out;
        MessageLogInfo messageLogInfo = (MessageLogInfo)object;
        if (!jSONSerializer.hasPropertyFilters(this)) {
            super.writeNoneASM(jSONSerializer, object, object2, type, n);
            return;
        }
        serializeWriter.write(91);
        String string = "addColumn";
        SerializeWriter serializeWriter2 = serializeWriter;
        serializeWriter2.write(messageLogInfo.isAddColumn());
        serializeWriter2.write(44);
        string = "createTime";
        Date date = messageLogInfo.getCreateTime();
        if (date == null) {
            serializeWriter.writeNull();
        } else if (date.getClass() == Date.class) {
            if (this.createTime_asm_ser_ == null) {
                this.createTime_asm_ser_ = jSONSerializer.getObjectWriter(Date.class);
            }
            if ((objectSerializer = this.createTime_asm_ser_) instanceof JavaBeanSerializer) {
                ((JavaBeanSerializer)objectSerializer).writeAsArrayNonContext(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            } else {
                objectSerializer.write(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            }
        } else {
            jSONSerializer.writeWithFieldName(date, string, this.createTime_asm_fieldType, 0);
        }
        serializeWriter.write(44);
        string = "data";
        serializeWriter.writeString(messageLogInfo.getData(), ',');
        string = "hermesCreateTime";
        date = messageLogInfo.getHermesCreateTime();
        if (date == null) {
            serializeWriter.writeNull();
        } else if (date.getClass() == Date.class) {
            if (this.hermesCreateTime_asm_ser_ == null) {
                this.hermesCreateTime_asm_ser_ = jSONSerializer.getObjectWriter(Date.class);
            }
            if ((objectSerializer = this.hermesCreateTime_asm_ser_) instanceof JavaBeanSerializer) {
                ((JavaBeanSerializer)objectSerializer).writeAsArrayNonContext(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            } else {
                objectSerializer.write(jSONSerializer, date, string, (Type)((Object)Date.class), 0);
            }
        } else {
            jSONSerializer.writeWithFieldName(date, string, this.hermesCreateTime_asm_fieldType, 0);
        }
        serializeWriter.write(44);
        string = "info";
        serializeWriter.writeString(messageLogInfo.getInfo(), ',');
        string = "messageId";
        serializeWriter.writeString(messageLogInfo.getMessageId(), ',');
        string = "result";
        serializeWriter.writeString(messageLogInfo.getResult(), ',');
        string = "roomId";
        serializeWriter.writeString(messageLogInfo.getRoomId(), ',');
        string = "tableName";
        serializeWriter.writeString(messageLogInfo.getTableName(), ',');
        string = "type";
        serializeWriter.writeString(messageLogInfo.getType(), ',');
        string = "uid";
        serializeWriter.writeString(messageLogInfo.getUid(), ']');
    }
}

Affect(row-cnt:1) cost in 4506 ms.
