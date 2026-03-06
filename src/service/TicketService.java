package src.service;

import java.util.List;
import java.util.Map;

public class TicketService {

    public enum Status {
        OPEN,
        PROCESSING,
        DONE,
        FAILED
    }

    public static class Ticket {
        private String ticketId;
        private String userId;
        private int priority;   // 1 ~ 5 (5 highest)
        private Status status;
        private int retryCount;
        private long createdAt;

        public Ticket(String ticketId, String userId, int priority, Status status, int retryCount, long createdAt) {
            this.ticketId = ticketId;
            this.userId = userId;
            this.priority = priority;
            this.status = status;
            this.retryCount = retryCount;
            this.createdAt = createdAt;
        }

        public String getTicketId() {
            return ticketId;
        }

        public String getUserId() {
            return userId;
        }

        public int getPriority() {
            return priority;
        }

        public Status getStatus() {
            return status;
        }

        public int getRetryCount() {
            return retryCount;
        }

        public long getCreatedAt() {
            return createdAt;
        }
    }

    /**
     * TODO 1
     *
     * userId별 티켓 개수를 집계하세요.
     */
    public Map<String, Integer> countTicketsByUser(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 2
     *
     * FAILED 상태인 티켓만 반환하세요.
     */
    public List<Ticket> findFailedTickets(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 3
     *
     * priority가 가장 높은 티켓을 반환하세요.
     * priority가 같으면 createdAt이 더 작은 티켓을 반환하세요.
     */
    public Ticket findHighestPriorityTicket(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 4
     *
     * priority 기준 내림차순 정렬하세요.
     * priority 같으면 createdAt 오름차순
     */
    public List<Ticket> sortByPriority(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 5
     *
     * userId별 FAILED 티켓 개수를 집계하세요.
     */
    public Map<String, Integer> countFailedTicketsByUser(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 6
     *
     * retryCount가 3 이상인 FAILED 티켓만 반환하세요.
     */
    public List<Ticket> findRetryTargets(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 7
     *
     * userId별 가장 최근(createdAt 가장 큰) 티켓을 반환하세요.
     */
    public Map<String, Ticket> findLatestTicketByUser(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 8
     *
     * OPEN 상태인 티켓만 대상으로
     * priority가 가장 높은 티켓을 반환하세요.
     *
     * priority 같으면 createdAt 작은 것
     */
    public Ticket findNextProcessingTicket(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 9
     *
     * userId별 priority 평균을 계산하세요.
     */
    public Map<String, Double> calculateAveragePriorityByUser(List<Ticket> tickets) {
        return null;
    }

    /**
     * TODO 10
     *
     * DONE 상태 티켓만 대상으로
     * userId별 가장 오래된(createdAt 작은) 티켓을 반환하세요.
     */
    public Map<String, Ticket> findOldestDoneTicketByUser(List<Ticket> tickets) {
        return null;
    }

}
