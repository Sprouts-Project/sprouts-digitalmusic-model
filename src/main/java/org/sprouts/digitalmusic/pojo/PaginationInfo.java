package org.sprouts.digitalmusic.pojo;
 
public final class PaginationInfo {
	
	// Attributes -------------------------------------------------------------
	
    private int currentPage;
    private int totalPages;
    private int itemCount;
    private int pageSize;
    private int minPage;
    private int maxPage;
    
    // Constructors -----------------------------------------------------------
    
    public PaginationInfo(int currentPage, int totalPages, int itemCount, int pageSize) {
		super();
		this.currentPage = currentPage;
		this.totalPages = totalPages;
		this.itemCount = itemCount;
		this.pageSize = pageSize;
		this.minPage = currentPage - 5 <= 0 ? 0 : currentPage - 5;
		this.maxPage = currentPage + 5 >= totalPages ? totalPages : currentPage + 5;
	}
    
	public PaginationInfo() {
		super();
	}
    
	// Getters/Setters --------------------------------------------------------
    
    public int getCurrentPage() {
		return currentPage;
	}
    
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getMinPage() {
		return minPage;
	}

	public void setMinPage(int minPage) {
		this.minPage = minPage;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
}