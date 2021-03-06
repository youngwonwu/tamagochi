--------------------------------------------------------
--  파일이 생성됨 - 화요일-5월-17-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TAMAGOCHI
--------------------------------------------------------

  CREATE TABLE "MICOL"."TAMAGOCHI" 
   (	"NAME" VARCHAR2(20 BYTE), 
	"HUNGRY" NUMBER DEFAULT 50, 
	"CLEAN" NUMBER DEFAULT 50, 
	"TLIKE" NUMBER DEFAULT 50, 
	"HEALTH" NUMBER DEFAULT 50, 
	"ID" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table TAMAUSER
--------------------------------------------------------

  CREATE TABLE "MICOL"."TAMAUSER" 
   (	"ID" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007225
--------------------------------------------------------

  CREATE UNIQUE INDEX "MICOL"."SYS_C007225" ON "MICOL"."TAMAGOCHI" ("NAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007173
--------------------------------------------------------

  CREATE UNIQUE INDEX "MICOL"."SYS_C007173" ON "MICOL"."TAMAUSER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table TAMAGOCHI
--------------------------------------------------------

  ALTER TABLE "MICOL"."TAMAGOCHI" ADD PRIMARY KEY ("NAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MICOL"."TAMAGOCHI" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "MICOL"."TAMAGOCHI" MODIFY ("HEALTH" NOT NULL ENABLE);
  ALTER TABLE "MICOL"."TAMAGOCHI" MODIFY ("TLIKE" NOT NULL ENABLE);
  ALTER TABLE "MICOL"."TAMAGOCHI" MODIFY ("CLEAN" NOT NULL ENABLE);
  ALTER TABLE "MICOL"."TAMAGOCHI" MODIFY ("HUNGRY" NOT NULL ENABLE);
  ALTER TABLE "MICOL"."TAMAGOCHI" MODIFY ("NAME" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TAMAUSER
--------------------------------------------------------

  ALTER TABLE "MICOL"."TAMAUSER" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "MICOL"."TAMAUSER" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "MICOL"."TAMAUSER" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TAMAGOCHI
--------------------------------------------------------

  ALTER TABLE "MICOL"."TAMAGOCHI" ADD CONSTRAINT "TAMAGOCHI_ID_FK" FOREIGN KEY ("ID")
	  REFERENCES "MICOL"."TAMAUSER" ("ID") ON DELETE CASCADE ENABLE;
