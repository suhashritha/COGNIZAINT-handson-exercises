--Scenario 1
--Apply a 1% discount to loan interest rates for customers above 60 years old

BEGIN
    FOR cust IN (SELECT CUSTOMER_ID, AGE FROM CUSTOMERS)
    LOOP
        IF cust.AGE > 60 THEN
            UPDATE LOANS
            SET INTERESTRATE = INTERESTRATE - 1
            WHERE CUSTOMERID = cust.CUSTOMER_ID;

            DBMS_OUTPUT.PUT_LINE('Discount applied for Customer ID: '
                                  || cust.CUSTOMER_ID);
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Scenario 2
--Set VIP = TRUE for customers whose balance is above $10,000
DECLARE
BEGIN
    FOR cust IN (SELECT CUSTOMER_ID, BALANCE FROM CUSTOMERS)
    LOOP
        IF cust.BALANCE > 10000 THEN
            UPDATE CUSTOMERS
            SET VIP = 'TRUE'
            WHERE CUSTOMER_ID = cust.CUSTOMER_ID;

            DBMS_OUTPUT.PUT_LINE('Customer '
                                 || cust.CUSTOMER_ID
                                 || ' promoted to VIP.');
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Scenario 3
--Print reminders for loans due within the next 30 days
DECLARE
BEGIN
    FOR loan_rec IN (
        SELECT CUSTOMERID, LOANID, DUEDATE
        FROM LOANS
        WHERE DUEDATE BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ID '
            || loan_rec.CUSTOMERID
            || ' has Loan ID '
            || loan_rec.LOANID
            || ' due on '
            || TO_CHAR(loan_rec.DUEDATE, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
