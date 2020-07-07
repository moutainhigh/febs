package com.febs.purchase.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseCgtkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseCgtkExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDjbhIsNull() {
            addCriterion("djbh is null");
            return (Criteria) this;
        }

        public Criteria andDjbhIsNotNull() {
            addCriterion("djbh is not null");
            return (Criteria) this;
        }

        public Criteria andDjbhEqualTo(String value) {
            addCriterion("djbh =", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotEqualTo(String value) {
            addCriterion("djbh <>", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhGreaterThan(String value) {
            addCriterion("djbh >", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhGreaterThanOrEqualTo(String value) {
            addCriterion("djbh >=", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLessThan(String value) {
            addCriterion("djbh <", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLessThanOrEqualTo(String value) {
            addCriterion("djbh <=", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLike(String value) {
            addCriterion("djbh like", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotLike(String value) {
            addCriterion("djbh not like", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIn(List<String> values) {
            addCriterion("djbh in", values, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotIn(List<String> values) {
            addCriterion("djbh not in", values, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhBetween(String value1, String value2) {
            addCriterion("djbh between", value1, value2, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotBetween(String value1, String value2) {
            addCriterion("djbh not between", value1, value2, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjrqIsNull() {
            addCriterion("djrq is null");
            return (Criteria) this;
        }

        public Criteria andDjrqIsNotNull() {
            addCriterion("djrq is not null");
            return (Criteria) this;
        }

        public Criteria andDjrqEqualTo(Integer value) {
            addCriterion("djrq =", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqNotEqualTo(Integer value) {
            addCriterion("djrq <>", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqGreaterThan(Integer value) {
            addCriterion("djrq >", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("djrq >=", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqLessThan(Integer value) {
            addCriterion("djrq <", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqLessThanOrEqualTo(Integer value) {
            addCriterion("djrq <=", value, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqIn(List<Integer> values) {
            addCriterion("djrq in", values, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqNotIn(List<Integer> values) {
            addCriterion("djrq not in", values, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqBetween(Integer value1, Integer value2) {
            addCriterion("djrq between", value1, value2, "djrq");
            return (Criteria) this;
        }

        public Criteria andDjrqNotBetween(Integer value1, Integer value2) {
            addCriterion("djrq not between", value1, value2, "djrq");
            return (Criteria) this;
        }

        public Criteria andGysIdIsNull() {
            addCriterion("gys_id is null");
            return (Criteria) this;
        }

        public Criteria andGysIdIsNotNull() {
            addCriterion("gys_id is not null");
            return (Criteria) this;
        }

        public Criteria andGysIdEqualTo(Integer value) {
            addCriterion("gys_id =", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotEqualTo(Integer value) {
            addCriterion("gys_id <>", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThan(Integer value) {
            addCriterion("gys_id >", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gys_id >=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThan(Integer value) {
            addCriterion("gys_id <", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThanOrEqualTo(Integer value) {
            addCriterion("gys_id <=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdIn(List<Integer> values) {
            addCriterion("gys_id in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotIn(List<Integer> values) {
            addCriterion("gys_id not in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdBetween(Integer value1, Integer value2) {
            addCriterion("gys_id between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gys_id not between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andJeIsNull() {
            addCriterion("je is null");
            return (Criteria) this;
        }

        public Criteria andJeIsNotNull() {
            addCriterion("je is not null");
            return (Criteria) this;
        }

        public Criteria andJeEqualTo(BigDecimal value) {
            addCriterion("je =", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotEqualTo(BigDecimal value) {
            addCriterion("je <>", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThan(BigDecimal value) {
            addCriterion("je >", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("je >=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThan(BigDecimal value) {
            addCriterion("je <", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("je <=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeIn(List<BigDecimal> values) {
            addCriterion("je in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotIn(List<BigDecimal> values) {
            addCriterion("je not in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("je between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("je not between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andKhyhIdIsNull() {
            addCriterion("khyh_id is null");
            return (Criteria) this;
        }

        public Criteria andKhyhIdIsNotNull() {
            addCriterion("khyh_id is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhIdEqualTo(Integer value) {
            addCriterion("khyh_id =", value, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdNotEqualTo(Integer value) {
            addCriterion("khyh_id <>", value, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdGreaterThan(Integer value) {
            addCriterion("khyh_id >", value, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("khyh_id >=", value, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdLessThan(Integer value) {
            addCriterion("khyh_id <", value, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdLessThanOrEqualTo(Integer value) {
            addCriterion("khyh_id <=", value, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdIn(List<Integer> values) {
            addCriterion("khyh_id in", values, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdNotIn(List<Integer> values) {
            addCriterion("khyh_id not in", values, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdBetween(Integer value1, Integer value2) {
            addCriterion("khyh_id between", value1, value2, "khyhId");
            return (Criteria) this;
        }

        public Criteria andKhyhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("khyh_id not between", value1, value2, "khyhId");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNull() {
            addCriterion("yhzh is null");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNotNull() {
            addCriterion("yhzh is not null");
            return (Criteria) this;
        }

        public Criteria andYhzhEqualTo(String value) {
            addCriterion("yhzh =", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotEqualTo(String value) {
            addCriterion("yhzh <>", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThan(String value) {
            addCriterion("yhzh >", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThanOrEqualTo(String value) {
            addCriterion("yhzh >=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThan(String value) {
            addCriterion("yhzh <", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThanOrEqualTo(String value) {
            addCriterion("yhzh <=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLike(String value) {
            addCriterion("yhzh like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotLike(String value) {
            addCriterion("yhzh not like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhIn(List<String> values) {
            addCriterion("yhzh in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotIn(List<String> values) {
            addCriterion("yhzh not in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhBetween(String value1, String value2) {
            addCriterion("yhzh between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotBetween(String value1, String value2) {
            addCriterion("yhzh not between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andFjIsNull() {
            addCriterion("fj is null");
            return (Criteria) this;
        }

        public Criteria andFjIsNotNull() {
            addCriterion("fj is not null");
            return (Criteria) this;
        }

        public Criteria andFjEqualTo(String value) {
            addCriterion("fj =", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotEqualTo(String value) {
            addCriterion("fj <>", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThan(String value) {
            addCriterion("fj >", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjGreaterThanOrEqualTo(String value) {
            addCriterion("fj >=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThan(String value) {
            addCriterion("fj <", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLessThanOrEqualTo(String value) {
            addCriterion("fj <=", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjLike(String value) {
            addCriterion("fj like", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotLike(String value) {
            addCriterion("fj not like", value, "fj");
            return (Criteria) this;
        }

        public Criteria andFjIn(List<String> values) {
            addCriterion("fj in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotIn(List<String> values) {
            addCriterion("fj not in", values, "fj");
            return (Criteria) this;
        }

        public Criteria andFjBetween(String value1, String value2) {
            addCriterion("fj between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andFjNotBetween(String value1, String value2) {
            addCriterion("fj not between", value1, value2, "fj");
            return (Criteria) this;
        }

        public Criteria andZdrIsNull() {
            addCriterion("zdr is null");
            return (Criteria) this;
        }

        public Criteria andZdrIsNotNull() {
            addCriterion("zdr is not null");
            return (Criteria) this;
        }

        public Criteria andZdrEqualTo(String value) {
            addCriterion("zdr =", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrNotEqualTo(String value) {
            addCriterion("zdr <>", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrGreaterThan(String value) {
            addCriterion("zdr >", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrGreaterThanOrEqualTo(String value) {
            addCriterion("zdr >=", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrLessThan(String value) {
            addCriterion("zdr <", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrLessThanOrEqualTo(String value) {
            addCriterion("zdr <=", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrLike(String value) {
            addCriterion("zdr like", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrNotLike(String value) {
            addCriterion("zdr not like", value, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrIn(List<String> values) {
            addCriterion("zdr in", values, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrNotIn(List<String> values) {
            addCriterion("zdr not in", values, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrBetween(String value1, String value2) {
            addCriterion("zdr between", value1, value2, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrNotBetween(String value1, String value2) {
            addCriterion("zdr not between", value1, value2, "zdr");
            return (Criteria) this;
        }

        public Criteria andZdrqIsNull() {
            addCriterion("zdrq is null");
            return (Criteria) this;
        }

        public Criteria andZdrqIsNotNull() {
            addCriterion("zdrq is not null");
            return (Criteria) this;
        }

        public Criteria andZdrqEqualTo(Integer value) {
            addCriterion("zdrq =", value, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqNotEqualTo(Integer value) {
            addCriterion("zdrq <>", value, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqGreaterThan(Integer value) {
            addCriterion("zdrq >", value, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("zdrq >=", value, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqLessThan(Integer value) {
            addCriterion("zdrq <", value, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqLessThanOrEqualTo(Integer value) {
            addCriterion("zdrq <=", value, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqIn(List<Integer> values) {
            addCriterion("zdrq in", values, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqNotIn(List<Integer> values) {
            addCriterion("zdrq not in", values, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqBetween(Integer value1, Integer value2) {
            addCriterion("zdrq between", value1, value2, "zdrq");
            return (Criteria) this;
        }

        public Criteria andZdrqNotBetween(Integer value1, Integer value2) {
            addCriterion("zdrq not between", value1, value2, "zdrq");
            return (Criteria) this;
        }

        public Criteria andQrIsNull() {
            addCriterion("qr is null");
            return (Criteria) this;
        }

        public Criteria andQrIsNotNull() {
            addCriterion("qr is not null");
            return (Criteria) this;
        }

        public Criteria andQrEqualTo(Byte value) {
            addCriterion("qr =", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotEqualTo(Byte value) {
            addCriterion("qr <>", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrGreaterThan(Byte value) {
            addCriterion("qr >", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrGreaterThanOrEqualTo(Byte value) {
            addCriterion("qr >=", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLessThan(Byte value) {
            addCriterion("qr <", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLessThanOrEqualTo(Byte value) {
            addCriterion("qr <=", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrIn(List<Byte> values) {
            addCriterion("qr in", values, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotIn(List<Byte> values) {
            addCriterion("qr not in", values, "qr");
            return (Criteria) this;
        }

        public Criteria andQrBetween(Byte value1, Byte value2) {
            addCriterion("qr between", value1, value2, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotBetween(Byte value1, Byte value2) {
            addCriterion("qr not between", value1, value2, "qr");
            return (Criteria) this;
        }

        public Criteria andQrrIsNull() {
            addCriterion("qrr is null");
            return (Criteria) this;
        }

        public Criteria andQrrIsNotNull() {
            addCriterion("qrr is not null");
            return (Criteria) this;
        }

        public Criteria andQrrEqualTo(String value) {
            addCriterion("qrr =", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotEqualTo(String value) {
            addCriterion("qrr <>", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrGreaterThan(String value) {
            addCriterion("qrr >", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrGreaterThanOrEqualTo(String value) {
            addCriterion("qrr >=", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrLessThan(String value) {
            addCriterion("qrr <", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrLessThanOrEqualTo(String value) {
            addCriterion("qrr <=", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrLike(String value) {
            addCriterion("qrr like", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotLike(String value) {
            addCriterion("qrr not like", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrIn(List<String> values) {
            addCriterion("qrr in", values, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotIn(List<String> values) {
            addCriterion("qrr not in", values, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrBetween(String value1, String value2) {
            addCriterion("qrr between", value1, value2, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotBetween(String value1, String value2) {
            addCriterion("qrr not between", value1, value2, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrqIsNull() {
            addCriterion("qrrq is null");
            return (Criteria) this;
        }

        public Criteria andQrrqIsNotNull() {
            addCriterion("qrrq is not null");
            return (Criteria) this;
        }

        public Criteria andQrrqEqualTo(Integer value) {
            addCriterion("qrrq =", value, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqNotEqualTo(Integer value) {
            addCriterion("qrrq <>", value, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqGreaterThan(Integer value) {
            addCriterion("qrrq >", value, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("qrrq >=", value, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqLessThan(Integer value) {
            addCriterion("qrrq <", value, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqLessThanOrEqualTo(Integer value) {
            addCriterion("qrrq <=", value, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqIn(List<Integer> values) {
            addCriterion("qrrq in", values, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqNotIn(List<Integer> values) {
            addCriterion("qrrq not in", values, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqBetween(Integer value1, Integer value2) {
            addCriterion("qrrq between", value1, value2, "qrrq");
            return (Criteria) this;
        }

        public Criteria andQrrqNotBetween(Integer value1, Integer value2) {
            addCriterion("qrrq not between", value1, value2, "qrrq");
            return (Criteria) this;
        }

        public Criteria andShIsNull() {
            addCriterion("sh is null");
            return (Criteria) this;
        }

        public Criteria andShIsNotNull() {
            addCriterion("sh is not null");
            return (Criteria) this;
        }

        public Criteria andShEqualTo(Byte value) {
            addCriterion("sh =", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotEqualTo(Byte value) {
            addCriterion("sh <>", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShGreaterThan(Byte value) {
            addCriterion("sh >", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShGreaterThanOrEqualTo(Byte value) {
            addCriterion("sh >=", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLessThan(Byte value) {
            addCriterion("sh <", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLessThanOrEqualTo(Byte value) {
            addCriterion("sh <=", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShIn(List<Byte> values) {
            addCriterion("sh in", values, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotIn(List<Byte> values) {
            addCriterion("sh not in", values, "sh");
            return (Criteria) this;
        }

        public Criteria andShBetween(Byte value1, Byte value2) {
            addCriterion("sh between", value1, value2, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotBetween(Byte value1, Byte value2) {
            addCriterion("sh not between", value1, value2, "sh");
            return (Criteria) this;
        }

        public Criteria andShrIsNull() {
            addCriterion("shr is null");
            return (Criteria) this;
        }

        public Criteria andShrIsNotNull() {
            addCriterion("shr is not null");
            return (Criteria) this;
        }

        public Criteria andShrEqualTo(String value) {
            addCriterion("shr =", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotEqualTo(String value) {
            addCriterion("shr <>", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThan(String value) {
            addCriterion("shr >", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThanOrEqualTo(String value) {
            addCriterion("shr >=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThan(String value) {
            addCriterion("shr <", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThanOrEqualTo(String value) {
            addCriterion("shr <=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLike(String value) {
            addCriterion("shr like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotLike(String value) {
            addCriterion("shr not like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIn(List<String> values) {
            addCriterion("shr in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotIn(List<String> values) {
            addCriterion("shr not in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrBetween(String value1, String value2) {
            addCriterion("shr between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotBetween(String value1, String value2) {
            addCriterion("shr not between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrqIsNull() {
            addCriterion("shrq is null");
            return (Criteria) this;
        }

        public Criteria andShrqIsNotNull() {
            addCriterion("shrq is not null");
            return (Criteria) this;
        }

        public Criteria andShrqEqualTo(Integer value) {
            addCriterion("shrq =", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotEqualTo(Integer value) {
            addCriterion("shrq <>", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThan(Integer value) {
            addCriterion("shrq >", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("shrq >=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThan(Integer value) {
            addCriterion("shrq <", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThanOrEqualTo(Integer value) {
            addCriterion("shrq <=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqIn(List<Integer> values) {
            addCriterion("shrq in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotIn(List<Integer> values) {
            addCriterion("shrq not in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqBetween(Integer value1, Integer value2) {
            addCriterion("shrq between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotBetween(Integer value1, Integer value2) {
            addCriterion("shrq not between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andTkIsNull() {
            addCriterion("tk is null");
            return (Criteria) this;
        }

        public Criteria andTkIsNotNull() {
            addCriterion("tk is not null");
            return (Criteria) this;
        }

        public Criteria andTkEqualTo(Byte value) {
            addCriterion("tk =", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotEqualTo(Byte value) {
            addCriterion("tk <>", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkGreaterThan(Byte value) {
            addCriterion("tk >", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkGreaterThanOrEqualTo(Byte value) {
            addCriterion("tk >=", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLessThan(Byte value) {
            addCriterion("tk <", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLessThanOrEqualTo(Byte value) {
            addCriterion("tk <=", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkIn(List<Byte> values) {
            addCriterion("tk in", values, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotIn(List<Byte> values) {
            addCriterion("tk not in", values, "tk");
            return (Criteria) this;
        }

        public Criteria andTkBetween(Byte value1, Byte value2) {
            addCriterion("tk between", value1, value2, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotBetween(Byte value1, Byte value2) {
            addCriterion("tk not between", value1, value2, "tk");
            return (Criteria) this;
        }

        public Criteria andTkrIsNull() {
            addCriterion("tkr is null");
            return (Criteria) this;
        }

        public Criteria andTkrIsNotNull() {
            addCriterion("tkr is not null");
            return (Criteria) this;
        }

        public Criteria andTkrEqualTo(String value) {
            addCriterion("tkr =", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrNotEqualTo(String value) {
            addCriterion("tkr <>", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrGreaterThan(String value) {
            addCriterion("tkr >", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrGreaterThanOrEqualTo(String value) {
            addCriterion("tkr >=", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrLessThan(String value) {
            addCriterion("tkr <", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrLessThanOrEqualTo(String value) {
            addCriterion("tkr <=", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrLike(String value) {
            addCriterion("tkr like", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrNotLike(String value) {
            addCriterion("tkr not like", value, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrIn(List<String> values) {
            addCriterion("tkr in", values, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrNotIn(List<String> values) {
            addCriterion("tkr not in", values, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrBetween(String value1, String value2) {
            addCriterion("tkr between", value1, value2, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrNotBetween(String value1, String value2) {
            addCriterion("tkr not between", value1, value2, "tkr");
            return (Criteria) this;
        }

        public Criteria andTkrqIsNull() {
            addCriterion("tkrq is null");
            return (Criteria) this;
        }

        public Criteria andTkrqIsNotNull() {
            addCriterion("tkrq is not null");
            return (Criteria) this;
        }

        public Criteria andTkrqEqualTo(Integer value) {
            addCriterion("tkrq =", value, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqNotEqualTo(Integer value) {
            addCriterion("tkrq <>", value, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqGreaterThan(Integer value) {
            addCriterion("tkrq >", value, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("tkrq >=", value, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqLessThan(Integer value) {
            addCriterion("tkrq <", value, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqLessThanOrEqualTo(Integer value) {
            addCriterion("tkrq <=", value, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqIn(List<Integer> values) {
            addCriterion("tkrq in", values, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqNotIn(List<Integer> values) {
            addCriterion("tkrq not in", values, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqBetween(Integer value1, Integer value2) {
            addCriterion("tkrq between", value1, value2, "tkrq");
            return (Criteria) this;
        }

        public Criteria andTkrqNotBetween(Integer value1, Integer value2) {
            addCriterion("tkrq not between", value1, value2, "tkrq");
            return (Criteria) this;
        }

        public Criteria andZfIsNull() {
            addCriterion("zf is null");
            return (Criteria) this;
        }

        public Criteria andZfIsNotNull() {
            addCriterion("zf is not null");
            return (Criteria) this;
        }

        public Criteria andZfEqualTo(Byte value) {
            addCriterion("zf =", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotEqualTo(Byte value) {
            addCriterion("zf <>", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThan(Byte value) {
            addCriterion("zf >", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThanOrEqualTo(Byte value) {
            addCriterion("zf >=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThan(Byte value) {
            addCriterion("zf <", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThanOrEqualTo(Byte value) {
            addCriterion("zf <=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfIn(List<Byte> values) {
            addCriterion("zf in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotIn(List<Byte> values) {
            addCriterion("zf not in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfBetween(Byte value1, Byte value2) {
            addCriterion("zf between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotBetween(Byte value1, Byte value2) {
            addCriterion("zf not between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andZfrIsNull() {
            addCriterion("zfr is null");
            return (Criteria) this;
        }

        public Criteria andZfrIsNotNull() {
            addCriterion("zfr is not null");
            return (Criteria) this;
        }

        public Criteria andZfrEqualTo(String value) {
            addCriterion("zfr =", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrNotEqualTo(String value) {
            addCriterion("zfr <>", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrGreaterThan(String value) {
            addCriterion("zfr >", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrGreaterThanOrEqualTo(String value) {
            addCriterion("zfr >=", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrLessThan(String value) {
            addCriterion("zfr <", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrLessThanOrEqualTo(String value) {
            addCriterion("zfr <=", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrLike(String value) {
            addCriterion("zfr like", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrNotLike(String value) {
            addCriterion("zfr not like", value, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrIn(List<String> values) {
            addCriterion("zfr in", values, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrNotIn(List<String> values) {
            addCriterion("zfr not in", values, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrBetween(String value1, String value2) {
            addCriterion("zfr between", value1, value2, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrNotBetween(String value1, String value2) {
            addCriterion("zfr not between", value1, value2, "zfr");
            return (Criteria) this;
        }

        public Criteria andZfrqIsNull() {
            addCriterion("zfrq is null");
            return (Criteria) this;
        }

        public Criteria andZfrqIsNotNull() {
            addCriterion("zfrq is not null");
            return (Criteria) this;
        }

        public Criteria andZfrqEqualTo(Integer value) {
            addCriterion("zfrq =", value, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqNotEqualTo(Integer value) {
            addCriterion("zfrq <>", value, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqGreaterThan(Integer value) {
            addCriterion("zfrq >", value, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("zfrq >=", value, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqLessThan(Integer value) {
            addCriterion("zfrq <", value, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqLessThanOrEqualTo(Integer value) {
            addCriterion("zfrq <=", value, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqIn(List<Integer> values) {
            addCriterion("zfrq in", values, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqNotIn(List<Integer> values) {
            addCriterion("zfrq not in", values, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqBetween(Integer value1, Integer value2) {
            addCriterion("zfrq between", value1, value2, "zfrq");
            return (Criteria) this;
        }

        public Criteria andZfrqNotBetween(Integer value1, Integer value2) {
            addCriterion("zfrq not between", value1, value2, "zfrq");
            return (Criteria) this;
        }

        public Criteria andEx1IsNull() {
            addCriterion("ex1 is null");
            return (Criteria) this;
        }

        public Criteria andEx1IsNotNull() {
            addCriterion("ex1 is not null");
            return (Criteria) this;
        }

        public Criteria andEx1EqualTo(String value) {
            addCriterion("ex1 =", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotEqualTo(String value) {
            addCriterion("ex1 <>", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThan(String value) {
            addCriterion("ex1 >", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThanOrEqualTo(String value) {
            addCriterion("ex1 >=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThan(String value) {
            addCriterion("ex1 <", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThanOrEqualTo(String value) {
            addCriterion("ex1 <=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Like(String value) {
            addCriterion("ex1 like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotLike(String value) {
            addCriterion("ex1 not like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1In(List<String> values) {
            addCriterion("ex1 in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotIn(List<String> values) {
            addCriterion("ex1 not in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Between(String value1, String value2) {
            addCriterion("ex1 between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotBetween(String value1, String value2) {
            addCriterion("ex1 not between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx2IsNull() {
            addCriterion("ex2 is null");
            return (Criteria) this;
        }

        public Criteria andEx2IsNotNull() {
            addCriterion("ex2 is not null");
            return (Criteria) this;
        }

        public Criteria andEx2EqualTo(String value) {
            addCriterion("ex2 =", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotEqualTo(String value) {
            addCriterion("ex2 <>", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThan(String value) {
            addCriterion("ex2 >", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThanOrEqualTo(String value) {
            addCriterion("ex2 >=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThan(String value) {
            addCriterion("ex2 <", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThanOrEqualTo(String value) {
            addCriterion("ex2 <=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Like(String value) {
            addCriterion("ex2 like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotLike(String value) {
            addCriterion("ex2 not like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2In(List<String> values) {
            addCriterion("ex2 in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotIn(List<String> values) {
            addCriterion("ex2 not in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Between(String value1, String value2) {
            addCriterion("ex2 between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotBetween(String value1, String value2) {
            addCriterion("ex2 not between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx3IsNull() {
            addCriterion("ex3 is null");
            return (Criteria) this;
        }

        public Criteria andEx3IsNotNull() {
            addCriterion("ex3 is not null");
            return (Criteria) this;
        }

        public Criteria andEx3EqualTo(String value) {
            addCriterion("ex3 =", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotEqualTo(String value) {
            addCriterion("ex3 <>", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThan(String value) {
            addCriterion("ex3 >", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThanOrEqualTo(String value) {
            addCriterion("ex3 >=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThan(String value) {
            addCriterion("ex3 <", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThanOrEqualTo(String value) {
            addCriterion("ex3 <=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Like(String value) {
            addCriterion("ex3 like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotLike(String value) {
            addCriterion("ex3 not like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3In(List<String> values) {
            addCriterion("ex3 in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotIn(List<String> values) {
            addCriterion("ex3 not in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Between(String value1, String value2) {
            addCriterion("ex3 between", value1, value2, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotBetween(String value1, String value2) {
            addCriterion("ex3 not between", value1, value2, "ex3");
            return (Criteria) this;
        }
    }

    /**
     */
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