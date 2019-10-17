package com.gmail.mosoft521.cp.jxc.entity;

import java.util.ArrayList;
import java.util.List;

public class GysInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GysInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andJcIsNull() {
            addCriterion("jc is null");
            return (Criteria) this;
        }

        public Criteria andJcIsNotNull() {
            addCriterion("jc is not null");
            return (Criteria) this;
        }

        public Criteria andJcEqualTo(String value) {
            addCriterion("jc =", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotEqualTo(String value) {
            addCriterion("jc <>", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcGreaterThan(String value) {
            addCriterion("jc >", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcGreaterThanOrEqualTo(String value) {
            addCriterion("jc >=", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLessThan(String value) {
            addCriterion("jc <", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLessThanOrEqualTo(String value) {
            addCriterion("jc <=", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcLike(String value) {
            addCriterion("jc like", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotLike(String value) {
            addCriterion("jc not like", value, "jc");
            return (Criteria) this;
        }

        public Criteria andJcIn(List<String> values) {
            addCriterion("jc in", values, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotIn(List<String> values) {
            addCriterion("jc not in", values, "jc");
            return (Criteria) this;
        }

        public Criteria andJcBetween(String value1, String value2) {
            addCriterion("jc between", value1, value2, "jc");
            return (Criteria) this;
        }

        public Criteria andJcNotBetween(String value1, String value2) {
            addCriterion("jc not between", value1, value2, "jc");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNull() {
            addCriterion("bianma is null");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNotNull() {
            addCriterion("bianma is not null");
            return (Criteria) this;
        }

        public Criteria andBianmaEqualTo(String value) {
            addCriterion("bianma =", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotEqualTo(String value) {
            addCriterion("bianma <>", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThan(String value) {
            addCriterion("bianma >", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThanOrEqualTo(String value) {
            addCriterion("bianma >=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThan(String value) {
            addCriterion("bianma <", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThanOrEqualTo(String value) {
            addCriterion("bianma <=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLike(String value) {
            addCriterion("bianma like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotLike(String value) {
            addCriterion("bianma not like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaIn(List<String> values) {
            addCriterion("bianma in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotIn(List<String> values) {
            addCriterion("bianma not in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaBetween(String value1, String value2) {
            addCriterion("bianma between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotBetween(String value1, String value2) {
            addCriterion("bianma not between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLianIsNull() {
            addCriterion("lian is null");
            return (Criteria) this;
        }

        public Criteria andLianIsNotNull() {
            addCriterion("lian is not null");
            return (Criteria) this;
        }

        public Criteria andLianEqualTo(String value) {
            addCriterion("lian =", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotEqualTo(String value) {
            addCriterion("lian <>", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianGreaterThan(String value) {
            addCriterion("lian >", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianGreaterThanOrEqualTo(String value) {
            addCriterion("lian >=", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianLessThan(String value) {
            addCriterion("lian <", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianLessThanOrEqualTo(String value) {
            addCriterion("lian <=", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianLike(String value) {
            addCriterion("lian like", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotLike(String value) {
            addCriterion("lian not like", value, "lian");
            return (Criteria) this;
        }

        public Criteria andLianIn(List<String> values) {
            addCriterion("lian in", values, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotIn(List<String> values) {
            addCriterion("lian not in", values, "lian");
            return (Criteria) this;
        }

        public Criteria andLianBetween(String value1, String value2) {
            addCriterion("lian between", value1, value2, "lian");
            return (Criteria) this;
        }

        public Criteria andLianNotBetween(String value1, String value2) {
            addCriterion("lian not between", value1, value2, "lian");
            return (Criteria) this;
        }

        public Criteria andLtelIsNull() {
            addCriterion("ltel is null");
            return (Criteria) this;
        }

        public Criteria andLtelIsNotNull() {
            addCriterion("ltel is not null");
            return (Criteria) this;
        }

        public Criteria andLtelEqualTo(String value) {
            addCriterion("ltel =", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotEqualTo(String value) {
            addCriterion("ltel <>", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelGreaterThan(String value) {
            addCriterion("ltel >", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelGreaterThanOrEqualTo(String value) {
            addCriterion("ltel >=", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelLessThan(String value) {
            addCriterion("ltel <", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelLessThanOrEqualTo(String value) {
            addCriterion("ltel <=", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelLike(String value) {
            addCriterion("ltel like", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotLike(String value) {
            addCriterion("ltel not like", value, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelIn(List<String> values) {
            addCriterion("ltel in", values, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotIn(List<String> values) {
            addCriterion("ltel not in", values, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelBetween(String value1, String value2) {
            addCriterion("ltel between", value1, value2, "ltel");
            return (Criteria) this;
        }

        public Criteria andLtelNotBetween(String value1, String value2) {
            addCriterion("ltel not between", value1, value2, "ltel");
            return (Criteria) this;
        }

        public Criteria andYhIsNull() {
            addCriterion("yh is null");
            return (Criteria) this;
        }

        public Criteria andYhIsNotNull() {
            addCriterion("yh is not null");
            return (Criteria) this;
        }

        public Criteria andYhEqualTo(String value) {
            addCriterion("yh =", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotEqualTo(String value) {
            addCriterion("yh <>", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhGreaterThan(String value) {
            addCriterion("yh >", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhGreaterThanOrEqualTo(String value) {
            addCriterion("yh >=", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhLessThan(String value) {
            addCriterion("yh <", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhLessThanOrEqualTo(String value) {
            addCriterion("yh <=", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhLike(String value) {
            addCriterion("yh like", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotLike(String value) {
            addCriterion("yh not like", value, "yh");
            return (Criteria) this;
        }

        public Criteria andYhIn(List<String> values) {
            addCriterion("yh in", values, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotIn(List<String> values) {
            addCriterion("yh not in", values, "yh");
            return (Criteria) this;
        }

        public Criteria andYhBetween(String value1, String value2) {
            addCriterion("yh between", value1, value2, "yh");
            return (Criteria) this;
        }

        public Criteria andYhNotBetween(String value1, String value2) {
            addCriterion("yh not between", value1, value2, "yh");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}