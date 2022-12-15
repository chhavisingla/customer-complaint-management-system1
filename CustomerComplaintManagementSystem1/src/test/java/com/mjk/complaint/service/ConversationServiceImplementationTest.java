package com.mjk.complaint.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mjk.complaint.entity.Conversation;
import com.mjk.complaint.repository.ConversationRepository;
class ConversationServiceImplementationTest {

	@Mock
	ConversationRepository ConversationRepository;
	
	@InjectMocks
	ConversationServiceImplementation reviewService;

	@Test
	void testInsertConversation() {
		fail("Not yet implemented");
	}