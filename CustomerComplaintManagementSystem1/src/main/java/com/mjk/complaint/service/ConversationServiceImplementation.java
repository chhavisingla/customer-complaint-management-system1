package com.mjk.complaint.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjk.complaint.entity.Conversation;
import com.mjk.complaint.repository.ConversationRepository;

@Service
public  class ConversationServiceImplementation implements ConversationService{
	@Autowired
	ConversationRepository conversationRepository;
	@Override
	@Transactional
	public Conversation insertConversation(Conversation user) throws Exception {
		Conversation savedUser =  conversationRepository.save(user);  // Note :  save() is already implemented by Spring Data JPA
		if(savedUser != null)
		{
			return savedUser;
		}
		else return null;
        }


	@Override
	public List<Conversation> getAllConversations() throws Exception {
		
		// may contains other code like security , logging , validation 
		
		List<Conversation> allUsers =  conversationRepository.findAll(); // Note : same as save
		return allUsers;
	}
	@Override
	public Conversation getConversationByIssueId(int issueId) throws Exception {
		Conversation outputConversationIssueId=conversationRepository.getConversationByIssueId(issueId);
		return outputConversationIssueId;
		
	}
	
	
	public String deleteConversation(int issueId) throws Exception{
		Conversation UserToBeDeleted=conversationRepository.getConversationByIssueId(issueId);
		conversationRepository.delete(UserToBeDeleted);
		return "Deleted";
	}
	@Override
	public Conversation getConversationByTitle(String title) throws Exception {
		Conversation outputTitle=conversationRepository.getConversationByTitle(title);
		return outputTitle;
		
	}
	
	@Override
	public Conversation getConversationByDescription(String description) throws Exception {
		Conversation outputConversationDescription=conversationRepository.getConversationByDescription(description);
		return outputConversationDescription;
		
	}
	
	

	@Override
	public Conversation getConversationByPostingDate(String postingDate) throws Exception {
		Conversation outputConversationPostingDate=conversationRepository.getConversationByPostingDate(postingDate);
		return outputConversationPostingDate;
		
	}


	@Override
	public Conversation getConversationByUserName(String userName)  throws Exception {
		Conversation outputConversationUsername=conversationRepository.getConversationByUserName(userName);
		return outputConversationUsername;
		// TODO Auto-generated method stub
		
	}
	
	

}
