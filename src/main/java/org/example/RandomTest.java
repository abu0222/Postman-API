//package gov.va.cqs.queueing;
//
//        import gov.va.cqs.queueing.controller.QueueController;
//        import gov.va.cqs.queueing.controller.QueuePatientController;
//        import gov.va.cqs.queueing.security.CQSUserDetailsService;
//        import gov.va.cqs.queueing.service.DataMaintenanceService;
//        import gov.va.cqs.queueing.service.QueueMemberService;
//        import gov.va.cqs.queueing.service.QueueService;
//        import org.junit.jupiter.api.Test;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.boot.test.context.SpringBootTest;
//
//        import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@SpringBootTest
////@AutoConfigureMockMvc
//class CqsQueueingApplicationTests {
//
//    @Test
//    void contextLoads() {
//        @Autowired
//        private QueueController queueController;
//        @Autowired
//        private QueuePatientController patientController;
//        @Autowired
//        private QueueService queueService;
//        @Autowired
//        private QueueMemberService memberService;
//        @Autowired
//        private DataMaintenanceService dataMaintenanceService;
//        @Autowired
//        private CQSUserDetailsService userDetailsService;
//
//        @Test
//        void contextLoads(){
//            //Ensure controllers and services load
//            assertThat(queueController).isNotNull();
//            assertThat(patientController).isNotNull();
//            assertThat(queueService).isNotNull();
//            assertThat(memberService).isNotNull();
//            assertThat(dataMaintenanceService).isNotNull();
//            assertThat(userDetailsService).isNotNull();
//        }
//    }